/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.singletonpattern.littlesingletonpatternv1;

/**
 *
 * @author moronkreacionz
 * @since Nov 19, 2015
 */
public class SingletonClass {

    private static SingletonClass uniqueInstance;
    private static int count=0;
    
    private SingletonClass() {
        count++;
        System.out.println("SingletonClass: uniqueInstance created Once ONLY (count"+count+")");
    }

    public static SingletonClass getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonClass();
        }
        return uniqueInstance;
    }
    public int getCount(){
        return count; 
    }
}
