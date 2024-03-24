package com.kittichanr.designpattern.observer;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min " + temperature + "/" + temperature + "/" + temperature);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemp();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
