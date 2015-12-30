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
class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        this.name = "Chicago Style Deep Dish Cheese Pizza";
        this.dough = "Extra Thick Crust Dough";
        this.sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Red Chilli Choppings");
    }
    
    @Override
    void cut(){
        System.out.println("Cutting: the "+ name +" into square slices");
    }

}
