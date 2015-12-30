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
    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza;
        switch (pizzaType) {
            case "cheese":
                pizza = new ChicagoStyleCheesePizza(); break;
            case "pepperoni":
                pizza = new ChicagoStylePepperoniPizza(); break;
            case "veggie":
                pizza = new ChicagoStyleVeggiePizza(); break;
            case "clam":
                pizza = new ChicagoStyleClamPizza(); break;
            default:
                pizza = new NYStyleRegularPizza(); break;
        }
        return pizza;
    }

}
