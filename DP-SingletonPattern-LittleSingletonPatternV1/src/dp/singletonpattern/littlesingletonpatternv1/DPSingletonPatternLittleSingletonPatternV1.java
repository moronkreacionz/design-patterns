/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.singletonpattern.littlesingletonpatternv1;

/**
 *
 * @author moronkreacionz
 */
public class DPSingletonPatternLittleSingletonPatternV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--");
        System.out.println("Hello MyClass");

        MyClass m1 = MyClass.getInstance();
        System.out.println("M1 count " + m1.getCount());
        MyClass m2 = MyClass.getInstance();
        System.out.println("M2 count " + m2.getCount());
        MyClass m3 = MyClass.getInstance();
        System.out.println("M3 count " + m3.getCount());
        MyClass m4 = MyClass.getInstance();
        System.out.println("M4 count " + m4.getCount());
        
        System.out.println("--");
        System.out.println("Hello SingletonClass");

        SingletonClass singletonObject1 = SingletonClass.getInstance();
        System.out.println("singletonObject1 count " + singletonObject1.getCount());
        
        SingletonClass singletonObject2 =SingletonClass.getInstance();
        System.out.println("singletonObject2 count " + singletonObject2.getCount());
        
        SingletonClass singletonObject3 =SingletonClass.getInstance();
        System.out.println("singletonObject3 count " + singletonObject3.getCount());
        
        SingletonClass singletonObject4 =SingletonClass.getInstance();
        System.out.println("singletonObject4 count " + singletonObject4.getCount());
        
    }

}
