/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.observerpattern.v1;

/**
 *
 * @author moronkreacionz
 */
public interface Observer {
    
    public void update(float temperature, float humidity, float pressure);
    
}
