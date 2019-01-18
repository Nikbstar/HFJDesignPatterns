package ru.nik66.weather;

import ru.nik66.weather.data.Parser;
import ru.nik66.weather.interfaces.Observer;
import ru.nik66.weather.interfaces.Subject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private float temperature;
    private float humidity;
    private float pressure;

    private List<Observer> observers = new ArrayList<>();

    public void measurementsChanged() {
        this.notifyObserver();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setMeasurements() {
        Parser parser = new Parser();
        try {
            this.temperature = parser.getDatas().get(0);
            this.humidity = parser.getDatas().get(1);
            this.pressure = parser.getDatas().get(2);
            measurementsChanged();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : this.observers) {
            observer.update(this.getTemperature(), this.getHumidity(), this.getPressure());
        }
    }
}
