/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dp.commandpattern.remotecontrolv5macrocommand;

/**
 *
 * @author moronkreacionz
 * @since Nov 26, 2015
 */
class TV {

    private String name; 
    private boolean status ; 
    
    public TV(){
        this.name = "NONAME";
        this.status = false; 
    }
    
    public TV(String name){
        this.name = name;
        this.status = false; 
    }
    
    public TV( String name, boolean status ){
        this.name = name;
        this.status = status; 
    }
    
    public void setName(String name){
        this.name = name; 
    }
    public String getName(){
        return this.name;
    }
    
    public void on(){
        System.out.println(">> "+ name + " TV has been switched ON");
        this.status = true;
    }
    public void off(){
        this.status = false;
        System.out.println(">> "+ name + " TV has been switched OFF");
    }

}
