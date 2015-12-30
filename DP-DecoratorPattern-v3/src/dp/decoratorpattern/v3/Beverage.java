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
public abstract class Beverage {

    enum BEVERAGE_SIZE {

        TALL, GRANDE, VENTI
    };
    String description = "Unknown beverage";
    double cost = 0.0;
    BEVERAGE_SIZE size = BEVERAGE_SIZE.VENTI;

    public Beverage() {

    }

    public BEVERAGE_SIZE getSize() {
        return this.size;
    }

    public void setSize(BEVERAGE_SIZE size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public double cost() {
        return cost;
    }

}
