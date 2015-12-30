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
class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza() {
        this.name = "NY Veggie Pizza";
        this.dough = "Thick Dough";
        this.sauce = "Red Indian Tomato Sauce";
        
        toppings.add("Veggie Special Oregano");
        toppings.add("Red Chilli Flakes");
        toppings.add("Corn");
        toppings.add("Mushroom");
        toppings.add("Capsicum");
    }

}
