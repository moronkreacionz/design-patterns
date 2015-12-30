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
 * @since Dec 4, 2015
 */
public abstract class MenuComponent {
    
    // MenuComponent - Provides default implementation for every method
    
    // You notice below that the default implementations are made with Exception 
    // for UnsupportedOperationException 
    // Since some of these items only make sense for Leaf (MenuItems) 
    // and alternately for Compoenents (Menu's) 
    // it is best left to let them decide which methods to implement 
    
    // So if they dont support operations, they dont have to do anything, 
    // default methods have an unsupported operation exception 

    
    // These Composite methods help in  managing the Components of Composite Pattern 
    // eg: add remove and getChild for MenuComponents 
    public void add(MenuComponent menuComponent)  {throw new UnsupportedOperationException();}
    public void remove(MenuComponent menuComponent)  {throw new UnsupportedOperationException();}
    public MenuComponent getChild(int i) {throw new UnsupportedOperationException();}
    
    // These are the operation methods used by the MenuItems 
    // Take them as Operations on the Leaf Nodes
    // You can use a couple of them for the Component too, in this case for Menu 
    public String getName() { throw new UnsupportedOperationException();}
    public String getDescription() { throw new UnsupportedOperationException(); }
    public boolean isVegetarian() { throw new UnsupportedOperationException(); }
    public double getPrice() { throw new UnsupportedOperationException(); }
    
    // This method can be used by Components and Leaf both
    // in our case MenuItem (leaf) and Menu (component)
    public void print() { throw new UnsupportedOperationException(); }
    
    public Iterator createIterator() { throw new UnsupportedOperationException(); }

}
