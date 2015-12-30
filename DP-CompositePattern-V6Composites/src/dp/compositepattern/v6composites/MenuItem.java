/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.compositepattern.v6composites;

import java.util.Iterator;

/**
 *
 * @author moronkreacionz
 * @since Dec 2, 2015
 */
public class MenuItem extends MenuComponent {

    // Here we extend the MenuItem (Leaf) from 
    // the MenuComponent Interface (Component Interface) 
    // (interface made based on abstract class)
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem() {
        this.name = "noname";
        this.description = "nodesc";
        this.vegetarian = true;
        this.price = 0.0;
    }

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    @Override
    public String toString() {
        return "MenuItem{" + "name=" + name
                + ", description=" + description
                + ", vegetarian=" + ((vegetarian) ? "veg" : "non-veg")
                + ", price=" + price + '}';
    }

    @Override
    public void print() {
        // overriding this print() Component Method 
        /* System.out.println("MenuItem{ name=" + name 
         + ", description=" + description 
         + ", vegetarian=" + ((vegetarian)? "veg":"non-veg")
         + ", price=" + price + "}");
         */
        System.out.print("\tn:" + this.getName() + ",  ");
        System.out.print("\t\t\t$" + this.getPrice() + ", ");
        if (this.isVegetarian()) {
            System.out.print("(Veg)");
        } else {
            System.out.print("(Non-Veg)");
        } // veg condition
        System.out.print(" -- d:" + this.getDescription());
        System.out.println("");
    }
    
    @Override
    public Iterator createIterator() { 
        return new NullIterator(); 
    }

}
