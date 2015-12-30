/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.observerpattern.v2;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author moronkreacionz
 * @since Oct 30, 2015
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public void measurementsChanged() {
        setChanged();
        System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- ");
        notifyObservers();
        System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- ");
        System.out.println("");
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
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

}
