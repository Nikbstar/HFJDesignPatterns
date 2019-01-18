package ru.nik66.weather.interfaces;

public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();

}
