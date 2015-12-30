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
class TheaterLights {

    String name;

    TheaterLights() {
        this.name = "TheaterLights";
    }

    void dim() {
        System.out.println( this.name + " ceiling lights going dim");
    }

    void on() {
        System.out.println( this.name + " lights powering on");
    }
}
