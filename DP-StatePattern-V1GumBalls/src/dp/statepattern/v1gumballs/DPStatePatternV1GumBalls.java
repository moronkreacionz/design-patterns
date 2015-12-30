/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.statepattern.v1gumballs;

/**
 *
 * @author moronkreacionz
 */
public class DPStatePatternV1GumBalls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("GumBalls State Pattern Application");
        System.out.println("----------------------------------");

        GumballMachine gm = new GumballMachine(5);
        System.out.println("first round" + gm);
        gm.dispense();
        System.out.println("now" + gm);
        

        System.out.println("");
        gm.insertQuarter(); System.out.println("\t\tafter inserting a quarter" + gm);
        gm.turnCrankFetchGumball(); System.out.println("\t\tafter turncrank to fetchgumball" + gm);
        
        
        System.out.println("");
        gm.insertQuarter(); System.out.println("\t\tafter inserting a quarter" + gm);
        gm.ejectQuarter(); System.out.println("\t\twe ejected the quarter" + gm);
        gm.turnCrankFetchGumball(); System.out.println("\t\tafter turncrank to fetchgumball" + gm);
        
        System.out.println("");
        gm.insertQuarter(); System.out.println("\t\tafter inserting a quarter" + gm);
        gm.turnCrankFetchGumball(); System.out.println("\t\tafter turncrank to fetchgumball" + gm);
        gm.insertQuarter(); System.out.println("\t\tafter inserting a quarter" + gm);
        gm.turnCrankFetchGumball(); System.out.println("\t\tafter turncrank to fetchgumball" + gm);
        gm.ejectQuarter(); System.out.println("\t\twe ejected the quarter" + gm);
        
        
        System.out.println("");
        gm.insertQuarter(); System.out.println("\t\tafter inserting a quarter" + gm);
        gm.insertQuarter(); System.out.println("\t\tafter inserting a quarter" + gm);
        gm.turnCrankFetchGumball(); System.out.println("\t\tafter turncrank to fetchgumball" + gm);
        gm.insertQuarter(); System.out.println("\t\tafter inserting a quarter" + gm);
        gm.turnCrankFetchGumball(); System.out.println("\t\tafter turncrank to fetchgumball" + gm);
        gm.insertQuarter(); System.out.println("\t\tafter inserting a quarter" + gm);
        gm.turnCrankFetchGumball(); System.out.println("\t\tafter turncrank to fetchgumball" + gm);
        
        
        System.out.println("");
        gm.insertQuarter(); System.out.println("\t\tafter inserting a quarter" + gm);
        gm.turnCrankFetchGumball(); System.out.println("\t\tafter turncrank to fetchgumball" + gm);
        
        System.out.println("");
        System.out.println("----------------------------------");
    }

}
