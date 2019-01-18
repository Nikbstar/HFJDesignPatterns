package ru.nik66.weather.displays;

import ru.nik66.weather.interfaces.DisplayElement;
import ru.nik66.weather.interfaces.Observer;

public class ThirdPartyDisplay implements Observer, DisplayElement {

    private float temperature = 0;
    private float humidity = 0;
    private float preassure = 0;

    @Override
    public void display() {
        //  Вывод другой информации на основании полученных данных
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.preassure = pressure;
    }
}
