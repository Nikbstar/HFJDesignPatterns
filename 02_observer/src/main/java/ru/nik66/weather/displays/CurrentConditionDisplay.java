package ru.nik66.weather.displays;

import ru.nik66.weather.interfaces.DisplayElement;
import ru.nik66.weather.interfaces.Observer;
import ru.nik66.weather.interfaces.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private Subject weatherData;

    private float temperature = 0;
    private float humidity = 0;
    private float preassure = 0;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        // Вывод текущих параметров
        System.out.println(String.format("Текущая температура: %s°", this.temperature));
        System.out.println(String.format("Текущая влажность: %s%%", this.humidity));
        System.out.println(String.format("Текущее давление: %s мм рт. ст.", this.preassure));
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.preassure = pressure;
        this.display();
    }
}
