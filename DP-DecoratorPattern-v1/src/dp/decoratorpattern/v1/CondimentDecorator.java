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
public abstract class CondimentDecorator extends Beverage {

    String condimentName; 
    Beverage beverage;
    double cost; 
    
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + this.condimentName; 
    }
    
    @Override
    public double cost() {
        return cost + beverage.cost();
    }
}
