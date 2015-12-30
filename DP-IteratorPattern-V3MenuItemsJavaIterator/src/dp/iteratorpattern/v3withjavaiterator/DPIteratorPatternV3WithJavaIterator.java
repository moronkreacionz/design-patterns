/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern.v3withjavaiterator;

/**
 *
 * @author moronkreacionz
 */
public class DPIteratorPatternV3WithJavaIterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Waitress alice = new Waitress("Alice");
        
        Waitress linda = new Waitress("Linda", pancakeHouseMenu, dinerMenu);
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("Alice's menu");
        alice.printMenu();
        
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        
        System.out.println("Linda's menu");
        linda.printMenu();
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        
        
        System.out.println("Linda's Vegetarian menu");
        linda.printVegetarianMenu();
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
    }
    
}
