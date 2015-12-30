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
class CeilingFan {

    private String name;
    // String location; // same as name 
    private boolean status;
    // originally boolean meant working or off 
    int speed; // now speed defines what speed its working 

    public static final int HIGH = 3;
    public static final int MED = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    public void high() {
        speed = HIGH;
        System.out.println(">> " + name + " speed set to >>"+speed);
    }

    public void med() {
        speed = MED;
        System.out.println(">> " + name + " speed set to >>"+speed);
    }

    public void low() {
        speed = LOW;
        System.out.println(">> " + name + " speed set to >>"+speed);
    }

    public void off() {
        speed = OFF;
        System.out.println(">> " + name + " speed set to >>"+speed);
    }

    public int getSpeed() {
        return speed;
    }

    public CeilingFan() {
        this.name = "NONAME";
        this.status = false;
    }

    public CeilingFan(String name) {
        this.name = name;
        this.status = false;
    }

    public CeilingFan(String name, boolean status) {
        this.name = name;
        this.status = status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    /* public void on(){
     System.out.println(">> "+ name + " CeilingFan has been switched ON");
     this.status = true;
     }
     public void off(){
     this.status = false;
     System.out.println(">> "+ name + " CeilingFan has been switched OFF");
     }
     */
}
