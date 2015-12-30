/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.singletonpattern.choclatefactoryv2;

/**
 *
 * @author moronkreacionz
 * @since Nov 19, 2015
 */
public class ChocoHolic {

    private boolean empty;
    private boolean boiled;
    private static int count;
    private static ChocoHolic uniqueInstance;

    private ChocoHolic() {
        this.empty = true;
        this.boiled = false;
        count++;
    }

    public static ChocoHolic getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocoHolic();
        }
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            // fill the content and start boiling 
            // fill the boiler with milk and chocolate
            this.empty = false;
            this.boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate 
            this.empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to boil 
            this.boiled = true;
        }
    }

    public boolean isEmpty() {
        return this.empty;
    }

    public boolean isBoiled() {
        return this.boiled;
    }

    public int getCount() {
        return count;
    }
}
