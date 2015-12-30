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
public class Mocha extends CondimentDecorator {
 
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        this.condimentName = "Mocha";
        this.cost = 0.20;
    }
    
}
