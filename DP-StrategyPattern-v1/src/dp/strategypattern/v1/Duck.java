/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.strategypattern.v1;

/**
 *
 * @author moronkreacionz
 * @since Oct 29, 2015
 */
public abstract class Duck {

    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public abstract void display();

    /**
     * @param fb
     */
    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    /**
     * @param qb
     */
    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
    
    
}
