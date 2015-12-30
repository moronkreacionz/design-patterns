/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dp.commandpattern.remotecontrolv1;

/**
 *
 * @author moronkreacionz
 * @since Nov 24, 2015
 */
class GarageDoor {
    
    private String name; 
    private boolean status ; 
    
    public GarageDoor(){
        this.name = "NONAME";
        this.status = false; 
    }
    
    public GarageDoor(String name){
        this.name = name;
        this.status = false; 
    }
    
    public GarageDoor( String name, boolean status ){
        this.name = name;
        this.status = status; 
    }
    
    public void setName(String name){
        this.name = name; 
    }
    public String getName(){
        return this.name;
    }
    
    public void open(){
        System.out.println(">> "+ name + " garagedoor being opened");
        this.status = true;
    }
    public void close(){
        this.status = false;
        System.out.println(">> "+ name + " garagedoor being closed down");
    }
}
