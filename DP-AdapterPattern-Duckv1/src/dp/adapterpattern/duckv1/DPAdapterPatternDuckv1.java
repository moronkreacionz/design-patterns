/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.adapterpattern.duckv1;

/**
 *
 * @author moronkreacionz
 */
public class DPAdapterPatternDuckv1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MallardDuck duckMallard = new MallardDuck("Blue Mallard Duck");
        WildTurkey wildTurkey = new WildTurkey("BlackWild Turkey");

        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        Turkey duckAdapter = new DuckAdapter(duckMallard);

        System.out.println("\n-----------------------------------");
        System.out.println("Turkey does:");
        wildTurkey.gobble();
        wildTurkey.fly();
        System.out.println("\n-----------------------------------");

        System.out.println("");
        System.out.println("\n-----------------------------------");
        System.out.println("Mallard Duck does:");
        duckAction(duckMallard);
        System.out.println("\n-----------------------------------");

        System.out.println("");
        System.out.println("\n-----------------------------------");
        System.out.println("Turkey Adapter Duck does:");
        duckAction(turkeyAdapter);
        System.out.println("\n-----------------------------------");

        System.out.println("\n\n\n");
        System.out.println("\n\n\n");
        
        System.out.println("\n-----------------------------------");
        System.out.println("Wild Turkey does:");
        turkeyAction(wildTurkey);
        System.out.println("\n-----------------------------------");

        System.out.println("");
        System.out.println("\n-----------------------------------");
        System.out.println("Duck Adapter Turkey does:");
        turkeyAction(duckAdapter);
        System.out.println("\n-----------------------------------");

        System.out.println("");
        System.out.println("\n-----------------------------------");

    }

    public static void duckAction(Duck duck) {
        duck.quack();
        duck.fly();
    }

    public static void turkeyAction(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }
}
