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
class Screen {

    String name;

    Screen() {
        this.name = "Screen";
    }

    void down() {
        System.out.println(this.name + " scrolling down");

    }

    void up() {
        System.out.println(this.name + " scrolling up");
    }
}
