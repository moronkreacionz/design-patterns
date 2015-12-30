/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dp.strategypattern.v2;

/**
 *
 * @author moronkreacionz
 * @since Oct 30, 2015
 */
public abstract class Character {

    WeaponBehavior weapon; 
    String name; 
    
    public abstract void fight();
    
    public void setWeapon(WeaponBehavior w)
    {
        this.weapon = w;
    }
    public void display()
    {
        System.out.println("Our "  + name+" fights with a" ); weapon.useWeapon();
    }
    
}
