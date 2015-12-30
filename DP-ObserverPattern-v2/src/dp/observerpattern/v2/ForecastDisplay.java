/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.observerpattern.v2;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author moronkreacionz
 * @since Oct 30, 2015
 */
class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.lastPressure = this.currentPressure;
            this.currentPressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.print("ForecastDisplay: ");
        if (this.currentPressure > this.lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (this.currentPressure == this.lastPressure) {
            System.out.println("More of the same");
        } else if (this.currentPressure < this.lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

}
