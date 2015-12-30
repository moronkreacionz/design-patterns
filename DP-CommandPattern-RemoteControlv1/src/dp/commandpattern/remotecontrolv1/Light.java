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
class Light {
    
    private String name; 
    private boolean status ; 
    
    public Light(){
        this.name = "NONAME";
        this.status = false; 
    }
    
    public Light(String name){
        this.name = name;
        this.status = false; 
    }
    
    public Light( String name, boolean status ){
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
        System.out.println(">> "+ name + " Light has been switched ON");
        this.status = true;
    }
    public void off(){
        this.status = false;
        System.out.println(">> "+ name + " Light has been switched OFF");
    }
}
