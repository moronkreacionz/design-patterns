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
public class SoldOutState implements State {

    GumballMachine gumballMachine;
    // holding the reference to the gumball Machine instance

    SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You cant insert a quarter, the machine is sold out, "
                + "take your quarter back");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject, you have not inserted a quarter yet");
        // since the machine does not accept quarters in this state, you cant eject any
    }

    @Override
    public void turnCrankFetchGumball() {
        System.out.println("You turned but there are no gumballs");
        // we cant deliver gumballs, there are none.. 
    }

    public void refill() {
        this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public String toString() {
        return "Sold Out";
    }
}
