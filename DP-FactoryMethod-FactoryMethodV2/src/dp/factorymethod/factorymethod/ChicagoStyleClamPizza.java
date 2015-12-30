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
class ChicagoStyleClamPizza extends Pizza {

    public ChicagoStyleClamPizza() {
        this.name = "Chicago Style Clammering Clam Pizza";
        this.dough = "Double Extra Thick Crust Dough";
        this.sauce = "Red Plum Tomato Ketchup";

        toppings.add("Shredded Pampering Cheese");
        toppings.add("Red Chilli");
        toppings.add("Green Leaves");
    }

    @Override
    void cut() {
        System.out.println("Cutting: the " + name + " into square slices");
    }

}
