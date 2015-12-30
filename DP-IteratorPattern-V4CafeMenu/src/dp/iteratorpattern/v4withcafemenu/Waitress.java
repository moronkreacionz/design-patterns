/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern.v4withcafemenu;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author moronkreacionz
 * @since Dec 2, 2015
 */
class Waitress {

    String name;
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public Waitress(String name) {
        this.name = name;
        this.pancakeHouseMenu = new PancakeHouseMenu();
        this.dinerMenu = new DinerMenu();
        this.cafeMenu = new CafeMenu();
    }

    public Waitress(String name, Menu pancakeHouseMenu, Menu dinerMenu) {
        this.name = name;
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public Waitress(String name, Menu[] manyMenus) {
        this.name = name;
        for (Menu menu : manyMenus) {
            if (menu.getClass().getCanonicalName().endsWith("PancakeHouseMenu")) {
                this.pancakeHouseMenu = menu;
            } else if (menu.getClass().getCanonicalName().endsWith("DinerMenu")) {
                this.dinerMenu = menu;
            } else if (menu.getClass().getCanonicalName().endsWith("CafeMenu")) {
                this.cafeMenu = menu;
            }
        }
    }

    public void printMenu() {
        // we dont use the getMenuItems method as implemented earlier ..
        // ArrayList breakfastItems = this.pancakeHouseMenu.getMenuItems();
        // MenuItem[] lunchItems = this.dinerMenu.getMenuItems();
        // Hashtable cafeItems = this.cafeMenu.getMenuItems(); // not implemented

        if (pancakeHouseMenu != null) {
            Iterator breakfastIterator = this.pancakeHouseMenu.createIterator();
            System.out.println("\t--------------------------");
            System.out.println("\tMenu Breakfast");
            printMenu(breakfastIterator);
        }
        if (dinerMenu != null) {
            Iterator lunchIterator = this.dinerMenu.createIterator();
            System.out.println("\t--------------------------");
            System.out.println("\tLunch");
            printMenu(lunchIterator);
        }
        if (cafeMenu != null) {
            Iterator cafeIterator = this.cafeMenu.createIterator();
            System.out.println("\t--------------------------");
            System.out.println("\tCafe");
            printMenu(cafeIterator);
        }

    }// print menu ends 

    private void printMenu(Iterator menuIterator) {

        while (menuIterator.hasNext()) {
            MenuItem mn = (MenuItem) menuIterator.next();
            if (mn != null) {
                System.out.print("\tn:" + mn.getName() + ",  ");
                System.out.print("\t\t\t$" + mn.getPrice() + ", ");
                if (mn.isVegetarian()) {
                    System.out.print("(Veg)");
                } else {
                    System.out.print("(Non-Veg)");
                } // veg condition
                System.out.print(" -- d:" + mn.getDescription());
                System.out.println("");
            } // null condition 
            else {
                System.out.println("something wrong");
            }
        }// while ends 
        //System.out.println("something wrong in while");
    }// menu print and Iterate

    public void printBreakfastMenu() {
    }

    public void printDinnerMenu() {
    }

    public boolean isItemVegetarian(String name) {
        if (pancakeHouseMenu != null) {
            Iterator breakfastIterator = this.pancakeHouseMenu.createIterator();
            System.out.println("\tChecking if " + name + " is Vegetarian in pancakeHouseMenu");
            if (isItemVegetarian(name, breakfastIterator)) {
                return true;
            }
        }
        if (dinerMenu != null) {
            Iterator lunchIterator = this.dinerMenu.createIterator();
            System.out.println("\tChecking if " + name + " is Vegetarian in dinerMenu");
            if (isItemVegetarian(name, lunchIterator)) {
                return true;
            }
        }
        if (cafeMenu != null) {
            Iterator cafeIterator = this.cafeMenu.createIterator();
            System.out.println("\tChecking if " + name + " is Vegetarian in cafeMenu");
            if (isItemVegetarian(name, cafeIterator)) {
                return true;
            }
        }
        return false;
    } // check item vegetarian across all menu items (pick each menu and ask within each) 

    private boolean isItemVegetarian(String name, Iterator menuIterator) {
        while (menuIterator.hasNext()) {
            MenuItem mn = (MenuItem) menuIterator.next();
            if (mn != null) {
                if (mn.getName().equalsIgnoreCase(name)) {
                    if (mn.isVegetarian()) {
                        System.out.print("(Veg)");
                        return true;
                    } else {
                        System.out.print("(Non-Veg)");
                        return false;
                    } // veg condition
                }
            } // null condition 
            else {
                return false;
            }// object null 
        }// while ends 
        return false;
    }// check item vegetarian within each menu ..

    public void printVegetarianMenu() {
        if (pancakeHouseMenu != null) {
            Iterator breakfastIterator = this.pancakeHouseMenu.createIterator();
            System.out.println("\t--------------------------");
            System.out.println("\tMenu Breakfast");
            printVegetarianMenu(breakfastIterator);
        }
        if (dinerMenu != null) {
            Iterator lunchIterator = this.dinerMenu.createIterator();
            System.out.println("\t--------------------------");
            System.out.println("\tLunch");
            printVegetarianMenu(lunchIterator);
        }
        if (cafeMenu != null) {
            Iterator cafeIterator = this.cafeMenu.createIterator();
            System.out.println("\t--------------------------");
            System.out.println("\tCafe");
            printVegetarianMenu(cafeIterator);
        }
    }

    private void printVegetarianMenu(Iterator menuIterator) {
        while (menuIterator.hasNext()) {
            MenuItem mn = (MenuItem) menuIterator.next();
            if (mn != null) {
                if (mn.isVegetarian()) {
                    System.out.print("\tn:" + mn.getName() + ",  ");
                    System.out.print("\t\t\t$" + mn.getPrice() + ", ");
                    System.out.print("(Veg)");
                    System.out.print(" -- d:" + mn.getDescription());
                    System.out.println("");
                }
            } // null condition 
        }// while ends 
    }

}
