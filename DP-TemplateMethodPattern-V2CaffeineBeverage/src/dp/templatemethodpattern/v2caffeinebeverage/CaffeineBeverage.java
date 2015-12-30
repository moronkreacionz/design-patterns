/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.templatemethodpattern.v2caffeinebeverage;

/**
 *
 * @author moronkreacionz
 * @since Nov 30, 2015
 */
abstract public class CaffeineBeverage {

    final void prepareRecipe() {
        // this is our template method 
        
        // because: 
        // 1 it is a method
        // 2 it serves as a template for an algorithm, in this case to prepare a caffeine
        // 3 each step can be handled by a separate method, 
        //          which can be generic or specific based on current 
        //          parent class or child class implementation 
        // The methods which need to be supplied as specific to a child class are made abstract methods 
        
        
        // each step is implemented as a separate method
        System.out.println("\n\nPreparing Caffeine Beverage:");
        System.out.print("boilWater(): ");boilWater();
        System.out.print("brew(): ");brew();
        System.out.print("pourInCup(): ");pourInCup();
        System.out.print("addCondiments(): ");addCondiments();
        // done 
    }

    // each step implements the sequence of algorithm steps 
    void boilWater() {
    
        System.out.println("Boiling Water");
    }

    // these are called as concrete methods 
    void pourInCup() {
        System.out.println("Pouring into cup");
    }
    
    // these are called as primitive methods to be implemented in the concrete subclasses 
    abstract void brew();
    abstract void addCondiments();

}
