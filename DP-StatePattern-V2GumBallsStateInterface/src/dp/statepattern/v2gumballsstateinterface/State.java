/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.statepattern.v2gumballsstateinterface;

/**
 *
 * @author moronkreacionz
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrankFetchGumball();
    void dispense();
    void refill();
}
