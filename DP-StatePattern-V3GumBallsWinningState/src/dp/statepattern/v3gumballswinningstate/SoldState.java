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
public class SoldState implements State {

    GumballMachine gumballMachine;
    // holding the reference to the gumball Machine instance

    SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait we have recieved your quarter, we're giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you alreay turned the crank");
    }

    @Override
    public void turnCrankFetchGumball() {
        System.out.println("Turning twice doesnt get you another gumball");
        // someone trying to cheat the machine 
    }

    @Override
    public void dispense() {
        this.gumballMachine.releaseBall();
        // we are in a sold state, we have to give them a gumball 

        
        if (this.gumballMachine.getCount() > 0) {
            System.out.println("\t\tMachine is delivering your gumball, please fetch it from tray");
            this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
        }
        else{
            System.out.println("\t\tOOps, out of gumballs now");
            this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
            //set state to sold out when we are out of gumballs 
        }
    }

    public void refill() {
    }

    @Override
    public String toString() {
        return "Dispensing a gumball";
    }

}
