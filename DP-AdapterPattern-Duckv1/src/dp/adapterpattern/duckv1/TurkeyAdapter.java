/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.adapterpattern.duckv1;

/**
 *
 * @author moronkreacionz
 * @since Nov 27, 2015
 */
class TurkeyAdapter implements Duck {

    // converts the turkey into duck. makes a turkey adapter for Ducks 
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        this.turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            this.turkey.fly();
        }
    }

}
