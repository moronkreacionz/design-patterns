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
class NYStyleRegularPizza extends Pizza {

    public NYStyleRegularPizza() {
        this.name = "NY Regular Pizza";
        this.dough = "Regular Dough";
        this.sauce = "Tomato Sauce";
        
        toppings.add("Regular Oregano");
        toppings.add("Regular Chilli Flakes");
    }

}
