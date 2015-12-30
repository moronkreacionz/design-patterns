/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.compositepattern.v6composites;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author moronkreacionz
 */
/* 
public interface Menu {
    public Iterator createIterator();
    public void setMenuName(String menuName);
    public String getMenuName();
    public void setAlternateDays(boolean b);
}
*/
// The older Menu Interface now is going to be replaced with a Menu Composite Class

public class Menu extends MenuComponent {

    ArrayList menuComponents = new ArrayList();
    String name;
    String description; 
    
    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }
 
    @Override
    public void add(MenuComponent menuComponent) {
        this.menuComponents.add(menuComponent);
    }
    @Override
    public void remove(MenuComponent menuComponent) {
        this.menuComponents.remove(menuComponent); 
    }
    
    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) this.menuComponents.get(i);
    }

    @Override
    public String getName() { 
        return this.name;
    }
    @Override
    public String getDescription() { 
        return this.description;
    }
    
    // Since Composite Menu does not have any attributes related to Vegetarian flag and price/
    // we get rid of those methods here 
    // @Override
    // public boolean isVegetarian() { throw new UnsupportedOperationException(); }
    // @Override
    // public double getPrice() { throw new UnsupportedOperationException(); }
    
    // Print method is more general purpose and it needs to be implemented
    @Override
    public void print() { 
        System.out.println("\tMenu Name:"+this.getName()); 
        System.out.println("\tDescription:"+this.getDescription());
            Iterator iterator = this.menuComponents.iterator();
            while( iterator.hasNext() ) {
                MenuComponent menuComponent = (MenuComponent) iterator.next();
                menuComponent.print();
            } // In case of submenus print() wud be invoked by parent menu composite
        System.out.println("----------------------------------------");
    }
    
    @Override
    public Iterator createIterator() { 
        return new CompositeIterator(menuComponents.iterator() ); 
    }
}
