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
class Waitress {

    String name;
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(String name) {
        this.name = name;
        this.pancakeHouseMenu = new PancakeHouseMenu();
        this.dinerMenu = new DinerMenu();
    }

    public void printMenu() {
        ArrayList breakfastItems = this.pancakeHouseMenu.getMenuItems();
        MenuItem[] lunchItems = this.dinerMenu.getMenuItems();

        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem mn = (MenuItem) breakfastItems.get(i);
            System.out.println("n:" + mn.getName() + ", ");
            System.out.println("d:" + mn.getDescription() + ", ");
            System.out.print("$" + mn.getPrice() + ", ");
            if (mn.isVegetarian()) {
                System.out.print("(Veg)");
            } else {
                System.out.print("(Non-Veg)");
            }
            System.out.println("");
        }

        for (int i = 0; i < lunchItems.length; i++) {
            MenuItem mn = lunchItems[i];
            // converted into an efficient for loop below 
            // for (MenuItem mn : lunchItems) {
            if (mn != null) 
            {
                System.out.println("n:" + mn.getName() + ", ");
                System.out.println("d:" + mn.getDescription() + ", ");
                System.out.print("$" + mn.getPrice() + ", ");
                if (mn.isVegetarian()) {
                    System.out.print("(Veg)");
                } else {
                    System.out.print("(Non-Veg)");
                }
                System.out.println("");
            }
        }
    }

    public void printBreakfastMenu() {
    }

    public void printDinnerMenu() {
    }

    public void printVegetarianMenu() {
    }

    public boolean isItemVegetarian(String name) {
        // detects if the item matchin "name" is vegetarian true or false.
        return true;
    }

}
