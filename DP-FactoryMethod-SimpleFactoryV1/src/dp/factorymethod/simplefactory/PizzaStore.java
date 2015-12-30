/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.factorymethod.simplefactory;

/**
 *
 * @author moronkreacionz
 * @since Nov 13, 2015
 */
public class PizzaStore {

    SimplePizzaFactory factory;

    PizzaStore(SimplePizzaFactory factory) {
        this.factory= factory;
    }

    Pizza orderPizza(String pizzaType,String orderedBy) {
        Pizza pizza = factory.createPizza(pizzaType);
        pizza.setOwner(orderedBy);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
