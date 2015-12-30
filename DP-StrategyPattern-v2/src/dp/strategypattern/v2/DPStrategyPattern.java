/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.strategypattern.v2;

/**
 *
 * @author moronkreacionz
 */
public class DPStrategyPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("-- -- -- -- -- -- -- -- -- -- ");
        System.out.println(" ");

        Character edward = new King();
        edward.setWeapon(new SwordBehavior());
        edward.fight();
        edward.display();

        System.out.println("-- -- -- -- -- -- -- -- -- -- ");
        System.out.println(" ");

        Character eliza = new Queen();
        eliza.setWeapon(new KnifeBehavior());
        eliza.fight();
        eliza.display();

        System.out.println("-- -- -- -- -- -- -- -- -- -- ");
        System.out.println(" ");

        Character robinhood = new Knight();
        robinhood.setWeapon(new BowAndArrowBehavior());
        robinhood.fight();
        robinhood.display();

        System.out.println("-- -- -- -- -- -- -- -- -- -- ");
        System.out.println(" ");
        System.out.println("-- -- -- -- -- -- -- -- -- -- ");
        Character elvi = new Troll();
        elvi.setWeapon(new AxeBehavior());
        elvi.fight();
        elvi.display();
 
        System.out.println("-- -- -- -- -- -- -- -- -- -- ");
     }

}
