/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern.v1menuitems;

/**
 *
 * @author moronkreacionz
 * @since Dec 2, 2015
 */
class DinerMenu {

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

    public MenuItem[] getMenuItems() {
        return menuItems;
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
