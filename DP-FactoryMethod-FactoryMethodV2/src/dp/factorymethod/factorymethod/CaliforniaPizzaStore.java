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
public class CaliforniaPizzaStore extends PizzaStore {

    CaliforniaPizzaStore() {
    }

     /**
     *
     * @param pizzaType
     * @return
     */
    @Override
    public Pizza  createPizza(String pizzaType) {
        Pizza pizza = null ;
        switch (pizzaType) {
            
           // TODO : 
           //     find the same approach for NY style and Chicago style 
           //     and do the needful for California style too 
                
//            case "cheese":
//                pizza = new CaliforniaStyleCheesePizza(); break;
//            case "greek":
//                pizza = new CaliforniaStyleGreekPizza(); break;
//            case "pepperoni":
//                pizza = new CaliforniaStylePepperoniPizza(); break;
//            case "clam":
//                pizza = new CaliforniaStyleClamPizza(); break;
//            case "veggie":
//                pizza = new CaliforniaStyleVeggiePizza(); break;
//            default:
//                pizza = new CaliforniaStyleRegularPizza(); break;
        }
        return pizza;
    }

}
