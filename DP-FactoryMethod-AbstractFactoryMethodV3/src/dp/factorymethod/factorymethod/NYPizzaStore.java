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
public class NYPizzaStore extends PizzaStore {

    NYPizzaStore() {
    }

    /**
     *
     * @param pizzaType
     * @return
     */
    @Override
    protected Pizza createPizza(String pizzaType) {
        Pizza pizza = null;

        PizzaIngredientFactory nyIngredientFactory = new NyPizzaIngredientFactory();

        switch (pizzaType) {
            case "cheese":
                pizza = new CheesePizza(nyIngredientFactory);
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(nyIngredientFactory);
                break;
            case "clam":
                pizza = new ClamPizza(nyIngredientFactory);
                break;
            default:
            case "veggie":
                pizza = new VeggiePizza(nyIngredientFactory);
                break;
        }
        return pizza;
    }

}
