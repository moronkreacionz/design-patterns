/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.compositepattern.v6composites;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author moronkreacionz
 * @since Dec 8, 2015
 */
class CompositeIterator implements Iterator {
    // CompositeIterator is implementing java.util.Iterator 

    Stack stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        // The top level composite (top menu object) we want to traverse 
        // is passed in as Iterator into a Stack datastructure 
        stack.push(iterator);
    }

    @Override
    public Object next() {
        // when client wants to navigate to the next element, 
        // we have to make sure there is one.. hence we check hasNext()
        if (hasNext()) {
            // if there is a next element, 
            
            Iterator iterator = (Iterator) stack.peek();
            // we get the current iterator off the stack (using peek) 
            
            MenuComponent component = (MenuComponent) iterator.next();
            //If that element is a Menu, we have another composite element, 
            // that needs to be traveresed deeper into the iteration. 
            
            // so we throw it on the stack, and return the component 
            if (component instanceof Menu) {
                stack.push(component.createIterator());
                // throw the composite item on stack and return 
            }
            return component;
        } else {
            return null;
        }
    }// next() ends here 

    @Override
    public boolean hasNext() {
        // navigating through the Stack recursively .. 
        
        // To see if there is a Next Element we çheck if the stack is empty()
        if (stack.empty()) {    
            return false;
        } else {
            // If stack not empty
            Iterator iterator = (Iterator) stack.peek();
            if (!iterator.hasNext()) {
                // Otherwise, we get the iterator off the top of the stack, 
                // see hasNext() it has a next element, 
                // if it doesnt we pop it off the stack 
                // and call hasNext() recursively
                stack.pop();
                return hasNext();
            } else {
                // otherwise there is next element and we return true; 
                return true;
            }
        }// stack not empty 
    }// hasNext()

    @Override
    public void remove(){
        throw new UnsupportedOperationException();
    }
}
