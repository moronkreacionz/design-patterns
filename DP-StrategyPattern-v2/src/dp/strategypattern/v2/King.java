/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.strategypattern.v2;

/**
 *
 * @author moronkreacionz
 * @since Oct 30, 2015
 */
public class King extends Character {

    public King() {
        this.name = "King";
    }

    @Override
    public void fight() {
        System.out.println("King fights");
    }
}
