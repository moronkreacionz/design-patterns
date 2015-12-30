/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern.v2withiterator;

/**
 *
 * @author moronkreacionz
 */
public interface Iterator {

    boolean hasNext(); // hasNext() method returns a boolean indicating whether or not there are more elements to iterate over
    Object next(); // and the next() method returns the next element from the collection 
}
