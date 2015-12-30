/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern.v3withjavaiterator;

import java.util.Iterator;


/**
 *
 * @author moronkreacionz
 * @since Dec 2, 2015
 */
class DinerMenu implements Menu {

    static final int MAX_ITEMS = 6;
    int noOfItems = 0;
    private MenuItem[] menuItems;
 
    public DinerMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];
       // for (int i = 0; i < this.menuItems.length; i++) {
       //     this.menuItems[i] = new MenuItem();
       // }
        addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce and tomato on whole wheat", true, 2.99);

        addItem("BLT", "Bacon with lettuce and tomato on whole wheat", false, 2.99);

        addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);

        addItem("HotDog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);

        // a couple of other Diner Menu items can be added here
    }

    public DinerMenu(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    // We commented this getMenuItems() method to operate with an Iterator given below
    // public MenuItem[] getMenuItems() {
    //    return menuItems;
    // }
    
    // It creates a DinerMenuIterator and returns an Iterator to the Array of menuitems 
    public Iterator createIterator(){
        
        // We are returning Iterator Interface, 
        // the client does not need to know internals of menu items storage structure.
        // nor does it need to know how DinerMenuIterator is implemented. 
        // this masks behavior of internal storage and operation to fetch menu items
        // with simplicity of a universal Iterator over diverse collections 
        
        return (Iterator) new DinerMenuIterator(this.menuItems);
    }

    
    public void setMenuItems(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    private void addItem(
            String name,
            String description,
            boolean vegetarian,
            double price) {
        MenuItem mn = new MenuItem(name, description, vegetarian, price);
        // menu item created and added to the menuItems ArrayList
        if (noOfItems >= MAX_ITEMS) {
            System.out.println("Sorry, Menu is full! Cant add items to the Menu.");
        } else {
            this.menuItems[noOfItems] = mn;
            noOfItems = noOfItems+1; 
        }
    }// added item to the MenuItem Array

}
