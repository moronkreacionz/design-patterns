/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.templatemethodpattern.v1coffeemaking;

/**
 *
 * @author moronkreacionz
 * @since Nov 30, 2015
 */
class Tea {

    void prepareRecipe() {
        // each step is implemented as a separate method
        System.out.println("\n\nPreparing Tea:");
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
        // done 
    }

    // each step implements the sequence of algorithm steps 
    
    // These two methods are Same as Tea and Coffee
    private void boilWater() {
        System.out.println("Boiling Water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // different from Coffee and special in Tea 
    private void steepTeaBag() {
        System.out.println("Steeping the Tea");
    }

    private void addLemon() {
        System.out.println("Adding Lemon");
    }

}
