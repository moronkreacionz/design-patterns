/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dp.compositepattern.v6composites;

import java.util.Iterator;

/**
 *
 * @author moronkreacionz
 * @since Dec 8, 2015
 */
class NullIterator implements Iterator {
 
    
    // This is the laziest Iterator we have ever seen, 
    // If we dont implement this and return null in createIterator() 
    // we would have to ensure that the function calling / invoking 
    // createIterator() is handling nulls
    // hence its better to create a nullIterator and return nothing 
    
    @Override
    public boolean hasNext() {
        // when hasnext is called to check if this iterator has objects,
        // we always return null 
        return false;
    }

    @Override
    public Object next() {
        //when next is called we return null 
        return null;
    }

    @Override
    public void remove() {
        //dont think abt supporting remove 
        throw new UnsupportedOperationException();
    }
}
