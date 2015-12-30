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
class Whip extends CondimentDecorator {
 
    public Whip(Beverage beverage) {
        this.beverage = beverage;
        this.condimentName = "Whip";
        this.cost = 0.10;
    }
    
}