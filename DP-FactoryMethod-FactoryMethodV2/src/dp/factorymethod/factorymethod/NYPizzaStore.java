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
    public Pizza createPizza(String pizzaType) {
        Pizza pizza;
        switch (pizzaType) {
            case "cheese":
                pizza = new NYStyleCheesePizza();
                break;
            case "pepperoni":
                pizza = new NYStylePepperoniPizza();
                break;
            case "veggie":
                pizza = new NYStyleVeggiePizza();
                break;
            // case "clam": // No clam pizza for NY 
               // pizza = new NYStyleClamPizza();
               //  break;
            //case "greek": // No GREEK pizza for NY 
              //  pizza = new NYStyleGreekPizza();
              //  break;
            default:
                pizza = new NYStyleRegularPizza();
                break;
        }
        return pizza;
    }

}
