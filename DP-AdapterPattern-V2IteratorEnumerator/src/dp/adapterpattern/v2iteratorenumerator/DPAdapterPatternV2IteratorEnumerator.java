/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.adapterpattern.v2iteratorenumerator;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.lang.Object;
import java.util.Vector;

/**
 *
 * @author moronkreacionz
 */
public class DPAdapterPatternV2IteratorEnumerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Handling two cases of "
                + " EnumerationIterator and IteratorEnumeration, "
                + " kindly review code for clarity");

        Vector<String> v = new Vector<String>(
                                    Arrays.asList(
                                        "orange","banana","apples","mangoes", 
                                        "pineapple", "kiwi", "grapes", 
                                        "berries", "jackfruit"
                                        )
                                );
        
        System.out.println("\n\n----- Vector Display");
        for( String str : v ) {
                System.out.println("vector item >>" + str );
        }
        
        
        
        System.out.println("\n\n----- Enumeration Display from Vector v");
        Enumeration<String> enumeration = v.elements(); 
        while(enumeration.hasMoreElements()){
            System.out.println("enumertion item>>"+enumeration.nextElement());
        }
        
        
        
        
        System.out.println("\n\n----- Iterator Display from Vector v");
        Iterator<String> iterator = v.iterator(); 
        while(iterator.hasNext()){
            System.out.println("iterator: item>>"+iterator.next()); 
        }
        
        
        
        
        System.out.println("\n\n----- EnumerationIterator Display from "
                                + " Enumeration(enumeration) treating "
                                + " it as an Iterator (iter1) ");
        System.out.println("\n\n Example Enumeration Iterator--------");
        System.out.println("Ex Enum Iterator Adapter Pattern ");
        enumeration = v.elements(); 
        // EnumerationIterator iter1 = new EnumerationIterator(enumeration) ; OR 
        Iterator<?> iter1 = new EnumerationIterator(enumeration) ;
        while(iter1.hasNext()){
            System.out.println("EnumerationIterator: item>>"+iter1.next()); 
        }
        
        
        
        
        System.out.println("\n\n----- IteratorEnumeration Display from "
                                + " Iterator (iterator) treating "
                                + " it as an Enumeration (enum1)");
        System.out.println("\n\n Example Iterator Enumeration--------");
        System.out.println("Ex Iterator Enum Adapter Pattern ");
        iterator = v.iterator(); 
        // IteratorEnumeration enum1 = new IteratorEnumeration(iterator) ; OR 
        Enumeration<?> enum1 = new IteratorEnumeration(iterator) ;
        while(enum1.hasMoreElements()){
            System.out.println("IteratorEnumeration: item>>"+enum1.nextElement()); 
        }
        
        System.out.println("-------------------------------");
    }
    
}
