/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.adapterpattern.v2iteratorenumerator;

import java.util.Enumeration;
import java.util.Iterator;

/**
 *
 * @author moronkreacionz
 * @since Nov 30, 2015
 */
public class EnumerationIterator implements Iterator {
    // Important Note: 
    // Target Interface in this case is Iterator 
    // Adapter name is EnumerationIterator 
    // Adaptee in this case is Enumeration Class 
    // This class helps working as an Adapter Class for the Adaptee (ExampleIterator) 
    // and the TargetInterface ExampleIterator 
    
    // Objective is to make Enumerations in old code look like Iterators in the new code
    

    Enumeration<?> enum1; // Adaptee object 

    public EnumerationIterator(Enumeration<?> enum1) {
        this.enum1 = enum1;
    }

    @Override
    public boolean hasNext() {
        return enum1.hasMoreElements();
    }

    @Override
    public Object next() {
        return (enum1.nextElement() +">ei>");
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException(); 
        // since this method is not supported in the Adaptee, 
        // we have to give up at the TargetInterface
        // this means we have to find a way to handle exceptions 
        // for the uncompatible operations 
    }

}
