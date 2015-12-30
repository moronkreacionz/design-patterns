/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.factorymethod.factorymethod;

/**
 *
 * @author moronkreacionz
 * @since Nov 16, 2015
 */
class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza() {
        this.name = "Chicago Style Pepperoni Pizza";
        this.dough = "Double Thick Dough";
        this.sauce = "Red Indian Tomato Sauce";
        
        toppings.add("Dark Veggie Special Oregano");
        toppings.add("Green Chilli Flakes");
        toppings.add("Small Carrots");
        toppings.add("Red Mushroom");
        toppings.add("Green Capsicum");
    }

    @Override
    void cut() {
        System.out.println("Cutting: the " + name + " into square slices");
    }

}
