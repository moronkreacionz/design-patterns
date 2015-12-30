/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.adapterpattern.duckv1;

import java.util.Random;

/**
 *
 * @author moronkreacionz
 * @since Nov 27, 2015
 */
class DuckAdapter implements Turkey {

    // converts the turkey into duck. makes a turkey adapter for Ducks 
    Duck duck;
    Random rand;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        this.rand = new Random();
    }

    @Override
    public void gobble() {
        this.duck.quack();
    }

    @Override
    public void fly() {
        if (this.rand.nextInt(5) == 0 ) {
            this.duck.fly();
        }
        // this logic was to introduce a slow flying duck to simulate turkey flying 
        // (one in 5 times) 
    }

}
