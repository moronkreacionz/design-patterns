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
class Projector {

    String name;

    Projector() {
        this.name = "Projector";
    }

    Projector(String projectorName) {
        this.name = projectorName;
    }

    void on() {
        System.out.println(this.name + " powering on");
    }

    void wideScreenMode() {
        System.out.println(this.name + " setting up on widescreen mode");
    }

    void off() {
        System.out.println(this.name + " powering off");
    }
}
