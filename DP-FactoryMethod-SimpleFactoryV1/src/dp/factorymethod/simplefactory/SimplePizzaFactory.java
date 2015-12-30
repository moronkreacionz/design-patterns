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
public class SimplePizzaFactory {

    Pizza createPizza(String pizzaType) {
        Pizza pizza = null;

        switch (pizzaType) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "greek":
                pizza = new GreekPizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            default:
                pizza = new RegularPizza();
                break;
        }
        return pizza;
    }
}
