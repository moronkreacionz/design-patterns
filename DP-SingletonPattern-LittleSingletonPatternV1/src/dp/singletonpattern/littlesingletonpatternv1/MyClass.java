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
public class MyClass {

    private static int count = 0;

    private MyClass() {
        count++;
        System.out.println("MyClass:: object created (count" + count + ")");
    }

    public static MyClass getInstance() {
       // not a perfect example of Singleton Class 
        // just showing how you can make constructor private and handle object creation 
        // and rendering the purpose of object instance handle 
        return new MyClass();
    }

    public int getCount() {
        return count;
    }
}
