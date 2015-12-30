/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.factorymethod.simplefactory;

/**
 *
 * @author moronkreacionz
 */
public class DPFactoryMethodSimpleFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SimplePizzaFactory dominosFactory = new SimplePizzaFactory();
        PizzaStore kandivaliStore = new PizzaStore(dominosFactory);
        
        System.out.println("Kandivali Store: Dominos Factory");
        kandivaliStore.orderPizza("veggie", "Joel");
        
         
    }
    
}
