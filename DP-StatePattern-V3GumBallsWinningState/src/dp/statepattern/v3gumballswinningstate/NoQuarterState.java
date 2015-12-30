/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.statepattern.v3gumballswinningstate;

/**
 *
 * @author moronkreacionz
 * @since Dec 9, 2015
 */
public class NoQuarterState implements State {

    GumballMachine gumballMachine;
    // holding the reference to the gumball Machine instance

    NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(this.gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrankFetchGumball() {
        System.out.println("You turned Crank, but there is no quarter");
        // we need a quarter first 
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

    @Override
    public String toString() {
        return "Waiting for Quarter";
    }

    public void refill() {
    }

}
