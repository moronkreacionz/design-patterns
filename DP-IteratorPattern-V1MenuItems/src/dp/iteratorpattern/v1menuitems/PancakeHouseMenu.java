/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dp.iteratorpattern.v1menuitems;

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

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
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
