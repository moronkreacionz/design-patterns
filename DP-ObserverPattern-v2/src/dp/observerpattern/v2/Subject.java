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
public interface Subject {
    
    public void registerObserver(ObserverNotRequired o);  // Method for Registering an ObserverNotRequired
    public void removeObserver(ObserverNotRequired o); // Method of Removing an ObserverNotRequired
    public void notifyObservers(); // Notifying all Observers 
    
}
