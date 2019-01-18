package ru.nik66.weather;

import org.junit.Test;
import ru.nik66.weather.displays.CurrentConditionDisplay;

import static org.junit.Assert.*;

public class WeatherDataTest {

    @Test
    public void weatherStation() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay ccd = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements();
    }

}