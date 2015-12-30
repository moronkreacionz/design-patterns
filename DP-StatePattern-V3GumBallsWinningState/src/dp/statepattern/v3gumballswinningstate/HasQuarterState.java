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
public class HasQuarterState implements State {

    GumballMachine gumballMachine;
    // holding the reference to the gumball Machine instance

    HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You cant insert another quarter!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned!");
        this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
        // if there is a quarter we return it and goback to NO_QUARTER state
    }

    @Override
    public void turnCrankFetchGumball() {
        System.out.println("You turned... ");
        this.gumballMachine.setState(this.gumballMachine.getSoldState());
        //dispense();
        // now user can fetch the gumball (machine invokes dispense())
        //SUCCESS, change the state to SOLD and invoke the dispense method.. 
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public void refill(){}
    
    @Override
    public String toString() {
        return "Waiting for turn of crank";
    }
}
