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
public abstract class CondimentDecorator extends Beverage {

    String condimentName;
    Beverage beverage;
    double costTall;
    double costGrande;
    double costVenit;

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + this.condimentName;
    }

    @Override
    public BEVERAGE_SIZE getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        double cost = beverage.cost(); 
        if (this.getSize() == BEVERAGE_SIZE.TALL) {
            return costTall + cost; 
        } else if (this.getSize() == BEVERAGE_SIZE.GRANDE) {
            return costGrande + cost; 
        } else if (this.getSize() == BEVERAGE_SIZE.VENTI) {
            return costVenit + cost; 
        } else {
            return cost; 
        }
    }
}
