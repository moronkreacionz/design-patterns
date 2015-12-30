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
class HotTub {
 
    private String name; 
    private boolean status ; 
    
    public HotTub(){
        this.name = "NONAME";
        this.status = false; 
    }
    
    public HotTub(String name){
        this.name = name;
        this.status = false; 
    }
    
    public HotTub( String name, boolean status ){
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
        System.out.println(">> "+ name + " HotTub has been switched ON");
        this.status = true;
    }
    public void off(){
        this.status = false;
        System.out.println(">> "+ name + " HotTub has been switched OFF");
    }

}
