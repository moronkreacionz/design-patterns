/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern.v5withmenuarraylist;

import java.util.Hashtable;
import java.util.Iterator;

/**
 *
 * @author moronkreacionz
 * @since Dec 3, 2015
 */
class CafeMenu implements Menu {

    Hashtable menuItems = new Hashtable();
    private String menuName;

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries", "Veggie Burger on a whole wheat bun, tomato and fries", true, 3.99);

        addItem("Soup of the day", "A cup of the Soup of the day, with a side salad", false, 3.69);

        addItem("Burrito", "A large burrito, with whole pinto beans, salse, guacamole", false, 4.29);

    }
    
    private void addItem(
            String name,
            String description,
            boolean vegetarian,
            double price) {
        MenuItem mn = new MenuItem(name, description, vegetarian, price);
        
        // menu item created and added to the menuItems Hashtable
        this.menuItems.put(mn.getName(), mn); /// hashed against the Menu name and menuItem as value.
        
    }// added item to Hashtable

    @Override
    public Iterator createIterator() {
        // hashtable has a collection in the values() operation and which can further be iterated
        
        // this iterator is created just for the values()
        // we are not getting the iterator for whole hashtable, its just for values()
        // hashtable is more complex than an Array and ArrayList, since it contains both keys and values
        // We can still get an iterator for Values which are the MenuItem objects 
        
        // does this make sense ? Think about it.. 
        // first we get the values of the Hashtable, which is just a collection of all objects 
        // in the hashtable which in our case is menuitems
        // now since this collection supports iterator() method, we are able to return java.util.iterator
        return this.menuItems.values().iterator();
    }

    @Override
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    @Override
    public String getMenuName() {
        return this.menuName;
    }

    @Override
    public void setAlternateDays(boolean b) {
        throw new UnsupportedOperationException("Alternate Days Menu operation not "
                + "supported for Cafe Menu"); 
    }
}
