/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.statepattern.v2gumballsstateinterface;

/**
 *
 * @author moronkreacionz
 * @since Dec 9, 2015
 */
public class WinnerState implements State {

    GumballMachine gumballMachine;
    // holding the reference to the gumball Machine instance

    WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("X");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("X");
    }

    @Override
    public void turnCrankFetchGumball() {
        System.out.println("X");
    }

    @Override
    public void dispense() {
        System.out.println("X");
    }

    @Override
    public String toString() {
        return "X";
    }

    @Override
    public void refill() {
        System.out.println("X");
    }
}
