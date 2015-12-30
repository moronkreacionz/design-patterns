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
public class GumballMachine {

    State soldOutState;
    State noQuarterstate;
    State hasQuarterState;
    State soldState;

    State state;// variable to hold the current state of gumball machine  
    private int count = 0;  // no of gumballs in the current Gumball dispenser machine 

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    public GumballMachine(int numberOfGumballs) {
        System.out.println("Moronic Gumball Machine.");
        System.out.println("Java enabled machine #2015");
        this.count = numberOfGumballs;
        
        this.soldOutState = new SoldOutState(this);
        this.noQuarterstate = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        
        // this means we are having a Gumball Machine ready to dispense (since it has balls)
        // If inventory is >0 we change state of GumballMachine 
        if (this.count > 0) {
            this.state = this.noQuarterstate;
        }else{
            this.state = this.soldOutState;
        }
        System.out.println("Inventory: " + this.count + " gumballs");
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrankFetchGumball() { //turnCrank() => turnCrankFetchGumball()
        state.turnCrankFetchGumball();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot..");
        if (count != 0) {
            count = count - 1;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n\t\tGumballMachine: State <<").append(state);
        sb.append(">>\n\t\tInventory: ").append(count).append(" gumball");
        if (count != 1) {
            sb.append("s");
        }
        return sb.toString();
    }

    public State getState() {
        return state;
    }

    public State getNoQuarterState() {
        return noQuarterstate;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setState(State state) {
        this.state = state;
    }
    public int getCount() {
        return this.count;
    }
}
