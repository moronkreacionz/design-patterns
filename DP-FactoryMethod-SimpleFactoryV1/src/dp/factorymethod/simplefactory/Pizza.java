/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.factorymethod.simplefactory;

import java.util.ArrayList;

/**
 *
 * @author moronkreacionz
 * @since Nov 13, 2015
 */
public abstract class Pizza {

    String name;
    String orderedBy;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();

    public Pizza() {
    }

    void setOwner(String orderedBy) {
        this.orderedBy = orderedBy;
    }

    void prepare() {
        System.out.println("Preparing: " + orderedBy + "'s " + name);
    }

    void bake() {
        System.out.println("Baking: " + orderedBy + "'s " + name);
    }

    void cut() {
        System.out.println("Cutting: " + orderedBy + "'s " + name);
    }

    void box() {
        System.out.println("Packing: " + orderedBy + "'s " + name);
    }

    @Override
    public String toString() {
        StringBuilder display = new StringBuilder();
        display.append("---------- Pizza Order-----------");
        display.append("ordered by:").append(orderedBy);
        display.append("name:").append(name);
        display.append("dough:").append(dough);
        display.append("sauce:").append(sauce);
        toppings.stream().forEach((topping) -> {
            display.append(topping).append("\n");
        });
        return display.toString();
    }

}
