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
public class IteratorEnumeration implements Enumeration {
    // Important Note: 
    // Target Interface in this case is Enumeration
    // Adapter name is IteratorEnumeration
    // Adaptee in this case is an Iterator 
    // This class helps working as an Adapter Class for the Adaptee (Iterator) 
    // and the TargetInterface Enumeration

    // Objective is to make Iterators in old code look like Enumerations in the new code
    Iterator<?> iter1; // Adaptee object 

    public IteratorEnumeration(Iterator<?> iter1) {
        this.iter1 = iter1;
    }

    @Override
    public boolean hasMoreElements() {
        return iter1.hasNext();

    }

    @Override
    public Object nextElement() {
        return (iter1.next() + ">ie>");
    }

}
