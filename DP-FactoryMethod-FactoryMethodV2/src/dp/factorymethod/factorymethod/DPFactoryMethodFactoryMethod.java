/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.factorymethod.factorymethod;

/**
 *
 * @author moronkreacionz
 */
public class DPFactoryMethodFactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PizzaStore nyStore = new NYPizzaStore();
        System.out.println("NY Store: Dominos Factory");
        nyStore.orderPizza("veggie", "Ethan");
        System.out.println("");
        System.out.println("");
        
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        System.out.println("Chicago Store: Dominos Factory");
        chicagoStore.orderPizza("cheese", "Joel");
         
    }
    
}
