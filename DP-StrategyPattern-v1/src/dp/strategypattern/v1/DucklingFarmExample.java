/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.strategypattern.v1;

/**
 *
 * @author moronkreacionz
 */
public class DucklingFarmExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("-- -- -- -- -- -- -- -- -- -- ");
        System.out.println(" ");

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.display();

        System.out.println("-- -- -- -- -- -- -- -- -- -- ");
        System.out.println(" ");

        Duck blueDuck = new BlueDuck();
        blueDuck.performQuack();
        blueDuck.performFly();
        blueDuck.display();

        System.out.println("-- -- -- -- -- -- -- -- -- -- ");
        System.out.println(" ");

        Duck modelDuckling = new ModelDuck();
        modelDuckling.performFly();
        modelDuckling.performQuack();
        modelDuckling.display();

        System.out.println("-- -- -- -- -- -- -- -- -- -- ");
        System.out.println(" ");
        System.out.println("-- -- -- -- -- -- -- -- -- -- ");
        modelDuckling.setFlyBehavior(new FlyRocketPowered());
        modelDuckling.performFly();
        modelDuckling.performQuack();
        modelDuckling.display();

        System.out.println("-- -- -- -- -- -- -- -- -- -- ");
        System.out.println(" ");
    }

}
