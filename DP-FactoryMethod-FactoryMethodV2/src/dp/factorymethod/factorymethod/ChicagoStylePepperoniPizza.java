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
class ChicagoStylePepperoniPizza extends Pizza {

    public ChicagoStylePepperoniPizza() {
        this.name = "Chicago Style Pepperoni Pizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "Red Sauce";

        toppings.add("Slice Pepperoni");
        toppings.add("Green Chilli");
        toppings.add("Dried Leaves");
    }

    @Override
    void cut() {
        System.out.println("Cutting: the " + name + " into square slices");
    }
}
