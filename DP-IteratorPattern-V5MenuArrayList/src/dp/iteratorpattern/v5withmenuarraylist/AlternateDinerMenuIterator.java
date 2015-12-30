/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern.v5withmenuarraylist;

import java.util.Calendar;
import java.util.Iterator;

/**
 *
 * @author moronkreacionz
 */
public class AlternateDinerMenuIterator implements Iterator {

    // this class implements Iterator interface, with hasNext() and next() methods
    MenuItem[] items; // holds a reference to the arg collection
    int position = 0; // maintains the current position while the iterator is being traversed 

    public AlternateDinerMenuIterator(MenuItem[] items) {
        // constructor takes the collection of menuItems we are going to iterate over 
        // This case its an Array of MenuItem[] objects
        this.items = items;
        Calendar rightNow = Calendar.getInstance();
        position = rightNow.DAY_OF_WEEK%2; 
    }

    @Override
    public boolean hasNext() {
        // check if item at position exists, or position is in boundary
        // to see if we have navigated through all elements of the collection 
        // also check for null objects if the array has allocation 
            // in collection but uninitialized objects 
        // return if we have another element in the collection at the current position
        //System.out.println("position: >"+position);
        //System.out.println("this.items.length: >"+this.items.length);
        //System.out.println("this.items[position]: >"+this.items[position]);
        if (position >= this.items.length || this.items[position] == null) {
            //System.out.println("Returning FALSE");
            return false;
        } else {
            //System.out.println("Returning TRUE");
            return true;
        }
    }

    @Override
    public Object next() {
        // return the next element from the collection and increments the position Ï
        MenuItem mn = this.items[position];
        position=position+2;
        return mn;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Alternating Diner Menu Iterator does not support remove()");
    }
 

}
