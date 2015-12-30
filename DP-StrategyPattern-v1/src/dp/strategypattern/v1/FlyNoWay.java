/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.strategypattern.v1;

/**
 *
 * @author moronkreacionz
 * @since Oct 29, 2015
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Can't FLY : FlyNoWay class, implementing FlyBehavior interface");
    }
}
