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
class DVDPlayer {

    String name;
    private String movieName;

    DVDPlayer() {
        this.name = "DVDPlayer";
    }

    void on() {
        System.out.println(this.name + " player powered up");
    }

    void play(String movieName) {
        this.movieName = movieName;
        System.out.println(this.name + " play movie: " + this.movieName);
    }

    void off() {
        System.out.println(this.name + " player powered off");
    }

    void eject() {
        System.out.println(this.name + " player "+this.movieName +" DVD ejected");
    }

    void stop() {
        System.out.println(this.name + " player stopped");
    }

    String getName() {
        return this.name;
    }
}
