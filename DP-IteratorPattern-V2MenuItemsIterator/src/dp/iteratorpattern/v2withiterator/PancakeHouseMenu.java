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
 * @since Dec 2, 2015
 */
class PancakeHouseMenu {
    
    private ArrayList<MenuItem> menuItems ;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList();
        addItem("K & B Pancake Breakfast", "Pancakes with scrambled eggs and toast", true , 2.99 );
        
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs and sausage", false , 2.99 );
        
        addItem("Blueberry Pancakes", "Pancake made with fresh blueberries", true , 2.49 );
        
        addItem("Waffles Breakfast", "Waffles, with your choice of blueberries", true , 3.59 );
    }

    public PancakeHouseMenu(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    
    // We commented this getMenuItems() method to operate with an Iterator given below
    // public ArrayList<MenuItem>  getMenuItems() {
    //    return menuItems;
    // }
    
    // It creates a PancakeHouseMenuIterator and returns an Iterator from an ArrayList collection 
    public Iterator createIterator(){
        
        // We are returning Iterator Interface, 
        // the client does not need to know internals of menu items storage structure.
        // nor does it need to know how PancakeHouseMenuIterator is implemented. 
        // this masks behavior of internal storage and operation to fetch menu items
        // with simplicity of a universal Iterator over diverse collections 
        
        return new PancakeHouseMenuIterator(this.menuItems);
    }


    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    private void addItem(
            String name, 
            String description, 
            boolean vegetarian, 
            double price) {
        MenuItem mn = new MenuItem(name, description, vegetarian, price); 
        // menu item created and added to the menuItems ArrayList
        this.menuItems.add(mn);
    }
    
    

}
