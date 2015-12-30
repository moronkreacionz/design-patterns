/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.factorymethod.factorymethod;

/**
 *
 * @author moronkreacionz
 * @since Nov 13, 2015
 */
public class ChicagoPizzaStore extends PizzaStore {

    ChicagoPizzaStore() {
    }

    /**
     *
     * @param pizzaType
     * @return
     */ 
    protected Pizza createPizza(String pizzaType) {
        Pizza pizza = null;

        PizzaIngredientFactory chiIngredientFactory = new ChicagoPizzaIngredientFactory();

        switch (pizzaType) {
            case "cheese":
                pizza = new CheesePizza(chiIngredientFactory);
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(chiIngredientFactory);
                break;
            case "clam":
                pizza = new ClamPizza(chiIngredientFactory);
                break;
            default:
            case "veggie":
                pizza = new VeggiePizza(chiIngredientFactory);
                break;
        }
        return pizza;
    }

}
