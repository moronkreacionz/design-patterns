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
public interface Subject {
    
    public void registerObserver(Observer o);  // Method for Registering an Observer
    public void removeObserver(Observer o); // Method of Removing an Observer
    public void notifyObservers(); // Notifying all Observers 
    
}
