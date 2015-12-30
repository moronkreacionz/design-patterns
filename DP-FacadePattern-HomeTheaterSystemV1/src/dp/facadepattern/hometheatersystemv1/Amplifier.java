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
class Amplifier {

    String name;
    private DVDPlayer dvd;
    private int volume;

    Amplifier(DVDPlayer dvd) {
        this.name = "Amplifier";
    }

    void on() {
        System.out.println(this.name + " powering on");
    }

    void setSurroundSound() {
        System.out.println(this.name + " setting up the Surround Sound");
    }

    void setDVD(DVDPlayer dvd) {
        this.dvd = dvd;
        System.out.println(this.name + " setting up DVD: " +this.dvd.getName());
        
    }

    void setVolume(int i) {
        this.volume = i;
        System.out.println(this.name + " setting up the volume to  " + this.volume);
    }

    void off() {
        System.out.println(this.name + " powering off");
    }

}
