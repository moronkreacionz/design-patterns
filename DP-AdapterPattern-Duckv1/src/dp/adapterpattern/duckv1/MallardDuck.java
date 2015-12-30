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
class MallardDuck implements Duck {

    private String name;

    public MallardDuck() {
        this.name = "noname";
    }

    public MallardDuck(String name) {
        this.name = name;
    }

    @Override
    public void quack() {
        System.out.println("Duck: " + this.name + " quacks ");
    }

    @Override
    public void fly() {
        System.out.println("Duck: " + this.name + " flies 5");
    }

}
