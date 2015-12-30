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
class WildTurkey implements Turkey {

    private String name;

    public WildTurkey() {
        this.name = "noname";
    }

    public WildTurkey(String name) {
        this.name = name;
    }

    public void gobble() {
        System.out.println("Turkey: " + this.name + " gobbles gobbles ");
    }

    public void fly() {
        System.out.println("Turkey: " + this.name + " flies 1");
    }

}
