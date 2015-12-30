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
class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings = 0;

    public StatisticsDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            float temperature = weatherData.getTemperature();
            this.tempSum += temperature;
            this.numReadings++;
            if (temperature > this.maxTemp) {
                this.maxTemp = temperature;
            }

            if (temperature < this.minTemp) {
                this.minTemp = temperature;
            }
            display();
        }

    }

    @Override
    public void display() {
        System.out.println("StatisticsDisplay: "
                + "Avg/Min/Max: "
                + (tempSum / numReadings) + " / "
                + this.minTemp + " / "
                + this.maxTemp);
    }

}
