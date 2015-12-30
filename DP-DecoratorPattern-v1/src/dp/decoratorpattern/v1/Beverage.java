/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.decoratorpattern.v1;

/**
 *
 * @author moronkreacionz
 * @since Oct 30, 2015
 */
public abstract class Beverage {

    String description = "Unknown beverage";
    double cost=0.0; 
    
    public Beverage() {
    }
    
    public String getDescription() {
        return description; 
    }
    
    public double cost(){ 
        return cost; 
    }
    
}
