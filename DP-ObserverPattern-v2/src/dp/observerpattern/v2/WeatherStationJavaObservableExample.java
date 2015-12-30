/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.observerpattern.v2;

/**
 *
 * @author moronkreacionz
 */
public class WeatherStationJavaObservableExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatindexDisplay = new HeatIndexDisplay(weatherData);
 
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 67, 29.3f);
        weatherData.setMeasurements(84, 68, 34.5f);
        weatherData.setMeasurements(89, 61, 31.5f);

        /* 
         currentDisplay.display();
         statisticsDisplay.display();
         forecastDisplay.display();
         heatindexDisplay.display();
         */
    }

}
