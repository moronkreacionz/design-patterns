/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.decoratorpattern.v3;

/**
 *
 * @author moronkreacionz
 * @since Oct 30, 2015
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        this.condimentName = "Mocha";
        this.costTall = 0.20;
        this.costGrande = 0.20;
        this.costVenit = 0.20;
    }

}
