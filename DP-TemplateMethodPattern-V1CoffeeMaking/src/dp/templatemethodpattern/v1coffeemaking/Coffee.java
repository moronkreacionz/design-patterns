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
class Coffee {

    void prepareRecipe() {
        // each step is implemented as a separate method
        System.out.println("\n\nPreparing Coffee:");
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugerAndMilk();
        // done 
    }

    // each step implements the sequence of algorithm steps 
    private void boilWater() {
        System.out.println("Boiling Water");
    }

    private void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void addSugerAndMilk() {
        System.out.println("Adding Sugar and Milk");
    }

}
