/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.statepattern.v1gumballs;

/**
 *
 * @author moronkreacionz
 * @since Dec 9, 2015
 */
public class GumballMachine {

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;  // variable to hold the current state of gumball machine 
    private int count = 0;  // no of gumballs in the current Gumball dispenser machine 

    public GumballMachine(int count) {
        System.out.println("Moronic Gumball Machine.");
        System.out.println("Java enabled machine #2015");
        this.count = count;
        // this means we are having a Gumball Machine ready to dispense (since it has balls)
        // If inventory is >0 we change state of GumballMachine 
        if (count > 0) {
            state = NO_QUARTER;
        }
        System.out.println("Inventory: "+this.count+" gumballs");
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("You cant insert another quarter!");
        } else if (state == NO_QUARTER) {

            state = HAS_QUARTER;  // we accept the quarter and transition to HAS_QUARTER state
            System.out.println("You inserted a quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("You cant insert a quarter, the machine is sold out, take your quarter back");
        } else if (state == SOLD) {
            System.out.println("Please wait we have recieved your quarter, we're giving you a gumball");
        }
    }

    public void ejectQuarter() {
        // customer tries to remove the quarter 
        if (state == HAS_QUARTER) {
            System.out.println("Quarter returned!");
            state = NO_QUARTER;
            // if there is a quarter we return it and goback to NO_QUARTER state
        } else if (state == NO_QUARTER) {
            System.out.println("You haven't inserted a quarter");
        } else if (state == SOLD) {
            System.out.println("Sorry, you alreay turned the crank and fetched a gumball");
        } else if (state == SOLD_OUT) {
            System.out.println("You can't eject a quarter, you have not inserted a quarter yet");
            // since the machine does not accept quarters in this state, you cant eject any
        }
    }

    public void turnCrankFetchGumball() { //turnCrank() => turnCrankFetchGumball()
        if (state == SOLD) {
            System.out.println("Turning twice doesnt get you another gumball");
            // someone trying to cheat the machine 
        } else if (state == NO_QUARTER) {
            System.out.println("You turned Crank, but there is no quarter");
            // we need a quarter first 
        } else if (state == SOLD_OUT) {
            System.out.println("You turned but there are no gumballs");
            // we cant deliver gumballs, there are none.. 
        } else if (state == HAS_QUARTER) {
            System.out.println("You turned... ");
            state = SOLD;
            dispense(); /// now user can fetch the gumball (machine invokes dispense())
            //SUCCESS, change the state to SOLD and invoke the dispense method.. 
        }
    }

    public void dispense() {
        if (state == SOLD) {

            System.out.println("A Gumball comes rolling out of the slot");
            // we are in a sold state, we have to give them a gumball 

            count = count - 1;
            if (count == 0) {
                System.out.println("\t\tOOps, out of gumballs now");
                state = SOLD_OUT;
                //set state to sold out when we are out of gumballs 
            } else {
                System.out.println("\t\tMachine is delivering your gumball, please fetch it from tray");
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("You need to pay first");
        } else if (state == SOLD_OUT) {
            System.out.println("No gumball dispensed");
        } else if (state == HAS_QUARTER) {
            System.out.println("No gumball dispensed");
        }
    }

    @Override
    public String toString() {
        return "\t\tGumballMachine{" + "state=" + getState() + ", count=" + count + '}';
    }

    private String getState() {
        switch (state) {
            case NO_QUARTER:
                return "NO_QUARTER";
            case HAS_QUARTER:
                return "HAS_QUARTER";
            case SOLD:
                return "SOLD";
            case SOLD_OUT:
            default:
                return "SOLD_OUT";

        }
    }

    public void setCount(int count) {
        this.count = count;
    }

}// 
