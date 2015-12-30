/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.factorymethod.factorymethod;

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
        System.out.println("Tossing dough..."+dough);
        System.out.println("Adding sauce..."+sauce);
        System.out.println("Adding toppings...");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("     " + toppings.get(i));
        }
    }

    void bake() {
        System.out.println("Baking: " + name + " for 25 mins at 350º ");
    }

    void cut() {
        System.out.println("Cutting: " + name + " into diagonal slices");
    }

    void box() {
        System.out.println("Packing: " + name + " in official PizzaStore Box");
        System.out.println(orderedBy + "'s - " + name + " - is ready!");
    }

    
    public String getName() {
        return name;
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
