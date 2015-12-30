/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dp.iteratorpattern.v5withmenuarraylist;

/**
 *
 * @author moronkreacionz
 * @since Dec 2, 2015
 */
class MenuItem {

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    @Override
    public String toString() {
        return "MenuItem{" + "name=" + name + ", description=" + description + ", vegetarian=" + vegetarian + ", price=" + price + '}';
    }
    
    
}
