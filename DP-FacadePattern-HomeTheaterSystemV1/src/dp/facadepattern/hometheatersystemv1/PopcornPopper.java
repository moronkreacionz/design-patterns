/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.facadepattern.hometheatersystemv1;

/**
 *
 * @author moronkreacionz
 * @since Nov 30, 2015
 */
class PopcornPopper {

    String name;

    PopcornPopper() {
        this.name = "PopcornPopper";
    }

    void on() {
        System.out.println( this.name + " powering on");
    }

    void pop() {
        System.out.println( this.name + " popping popcorns");
    }

    void off() {
        System.out.println( this.name + " powering off");
    }
}
