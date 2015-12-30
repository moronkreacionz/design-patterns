/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.commandpattern.remotecontrolv5macrocommand;

/**
 *
 * @author moronkreacionz
 * @since Nov 25, 2015
 */
class Stereo {

    private String name;
    private String cdName;
    private int volume;
    private boolean status;

    public Stereo() {
        this.name = "NONAME";
        this.cdName = "No-CDName";
        this.status = false;
        this.volume = 5;
    }

    public Stereo(String name) {
        this.name = name;
        this.cdName = "No-CDName";
        this.status = false;
        this.volume = 6;
    }

    public Stereo(String name, boolean status) {
        this.name = name;
        this.cdName = "No-CDName";
        this.status = status;
        this.volume = 7;
    }

    public Stereo(String name, String cdName, boolean status) {
        this.name = name;
        this.cdName = cdName;
        this.status = status;
        this.volume = 8;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCDName(String cdName) {
        this.cdName = cdName;
        System.out.println(">> " + this.name + " Stereo CD inserted: " + this.cdName);
        
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(">> " + this.name + " Stereo volume set:" + this.volume);
    }

    public String getName() {
        return this.name;
    }

    public void on() {
        System.out.println(">> " + this.name + " Stereo has been switched ON"); 
        this.status = true;
    }

    public void off() {
        this.status = false;
        System.out.println(">> " + this.name + " Stereo has been switched OFF");
    }
}
