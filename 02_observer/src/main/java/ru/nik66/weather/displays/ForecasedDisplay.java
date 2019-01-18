package ru.nik66.weather.displays;

import ru.nik66.weather.interfaces.DisplayElement;
import ru.nik66.weather.interfaces.Observer;

public class ForecasedDisplay implements Observer, DisplayElement {

    private float temperature = 0;
    private float humidity = 0;
    private float preassure = 0;

    @Override
    public void display() {
        // Вывод прогноза
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.preassure = pressure;
    }
}
