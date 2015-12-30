/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.singletonpattern.choclatefactoryv2;

/**
 *
 * @author moronkreacionz
 */
public class DPSingletonPatternChoclateFactoryV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--");
        System.out.println("Hello ChocoHolic Class");

        ChocoHolic chocoObject1 = ChocoHolic.getInstance();
        System.out.println("chocoObject1 count " + chocoObject1.getCount());

        ChocoHolic chocoObject2 = ChocoHolic.getInstance();
        System.out.println("chocoObject2 count " + chocoObject2.getCount());

        ChocoHolic chocoObject3 = ChocoHolic.getInstance();
        System.out.println("chocoObject3 count " + chocoObject3.getCount());

        ChocoHolic chocoObject4 = ChocoHolic.getInstance();
        System.out.println("chocoObject4 count " + chocoObject4.getCount());
    }

}
