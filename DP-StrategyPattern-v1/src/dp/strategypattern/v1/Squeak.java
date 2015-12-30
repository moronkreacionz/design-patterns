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
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<<squeak>> : Squeak class, implementing QuackBehavior interface");
    }

}
