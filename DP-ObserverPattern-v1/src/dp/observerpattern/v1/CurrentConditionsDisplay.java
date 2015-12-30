/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.observerpattern.v1;

/**
 *
 * @author moronkreacionz
 * @since Oct 30, 2015
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();

    }

    @Override
    public void display() {
        System.out.println("CurrentConditionsDisplay: "
                + this.temperature + " F degrees"
                + ", " + this.humidity + " % humidity"
                + ", " + this.pressure + " pressure");
    }

}
