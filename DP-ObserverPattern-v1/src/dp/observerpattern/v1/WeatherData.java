/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.observerpattern.v1;

import java.util.ArrayList;

/**
 *
 * @author moronkreacionz
 * @since Oct 30, 2015
 */
public class WeatherData implements Subject {

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    public void measurementsChanged() {
        notifyObservers();
    }
    
    public void setMeasurements(float temperature, float humidity, float pressure) {
        
        this.temperature = temperature; 
        this.humidity = humidity; 
        this.pressure = pressure; 
        this.measurementsChanged();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- ");
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(this.temperature, this.humidity, this.pressure);
        }
        System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- ");
        System.out.println("");
    }
}
