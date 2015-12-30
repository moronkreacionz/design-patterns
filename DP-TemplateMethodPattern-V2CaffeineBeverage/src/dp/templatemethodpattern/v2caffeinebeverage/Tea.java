/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.templatemethodpattern.v2caffeinebeverage;

/**
 *
 * @author moronkreacionz
 * @since Nov 30, 2015
 */
class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the Tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
