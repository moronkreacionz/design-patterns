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
class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza() {
        this.name = "NY Style Pepperoni Pizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "Bell Pepper Sauce";
        
        toppings.add("Special Pepperoni");
        toppings.add("Spicy Red Chilli");
    }

}
