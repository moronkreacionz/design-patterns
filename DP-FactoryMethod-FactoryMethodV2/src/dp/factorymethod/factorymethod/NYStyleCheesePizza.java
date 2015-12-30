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
class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        this.name = "NY Style Sauce and Cheese Pizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "Marinara Sauce";
        
        toppings.add("Grated Reggiano Cheese");
        toppings.add("Sliced Red Cheese");
    }
}
