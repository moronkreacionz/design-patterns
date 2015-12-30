/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.singletonpattern.choclateegmultithreadedv4;

/**
 *
 * @author moronkreacionz
 * @since Nov 19, 2015
 */
public class ChocoHolic {

    private boolean empty;
    private boolean boiled;
    private static int count;
    private volatile static ChocoHolic uniqueInstance ;
    // the volatile keyword ensures that multiple threads handle the uniqueInstance variable correctly
    // when it is being initialized to the Singleton instance 
        
    private ChocoHolic() {
        this.empty = true;
        this.boiled = false;
        count++;
    }

    public static ChocoHolic getInstance() {
        // check for an instance, and if there isnt one, 
        // enter the synchronized block 
            
        if (uniqueInstance == null) {
            // note, we only synchronize the block first time 
            synchronized (ChocoHolic.class) {
                // synchronized block 
        
                if(uniqueInstance == null) {
                    // inside the synchronized block, only if null create the instance 
                    uniqueInstance = new ChocoHolic();
                    
                } // second null check 
                
            }// sync class block ends 
            
        }// first null check 
        
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
