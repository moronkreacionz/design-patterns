/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern.v2withiterator;

import java.util.ArrayList;

/**
 *
 * @author moronkreacionz
 */
public class PancakeHouseMenuIterator implements Iterator {

    // this class implements Iterator interface, with hasNext() and next() methods
    ArrayList<MenuItem> items; // holds a reference to the arg collection
    int position = 0; // maintains the current position while the iterator is being traversed 

    public PancakeHouseMenuIterator(ArrayList items) {
        // constructor takes the collection of menuItems we are going to iterate over 
        // This case its an ArrayList of <MenuItem> objects
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        // check if item at position exists, or position is in boundary
        // to see if we have navigated through all elements of the collection 
        // also check for null objects if the array list has allocation 
            // in collection but uninitialized objects 
        // return if we have another element in the collection at the current position
        //System.out.println("position: >"+position);
        //System.out.println("this.items.size(): >"+this.items.size());
        //System.out.println("this.items.get(position): >"+this.items.get(position));
        
        if (position >= this.items.size() || this.items.get(position) == null) {
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
        MenuItem mn = this.items.get(position);
        position++;
        return mn;
    }

}
