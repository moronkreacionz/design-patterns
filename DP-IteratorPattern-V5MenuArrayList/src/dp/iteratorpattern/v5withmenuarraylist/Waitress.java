/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern.v5withmenuarraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author moronkreacionz
 * @since Dec 2, 2015
 */
class Waitress {

    String name;
    ArrayList myMenu;

    public Waitress(String name) {
        this.name = name;
        this.myMenu = new ArrayList<Menu>();
    }

    public Waitress(String name, ArrayList argMenus) {
        this.name = name;
        this.myMenu = argMenus;
    }

    /* public Waitress(String name, Menu[] manyMenus) {
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
     } */
    public void printMenu() {
        Iterator menuArrayListIterator = this.myMenu.iterator();

        while (menuArrayListIterator.hasNext()) {
            Menu eachMenu = (Menu) menuArrayListIterator.next();
            System.out.println("\t--------------------------");
            System.out.println("\t" + eachMenu.getMenuName());

            // Now for each Menu at hand, send the Iterator to Print            
            printMenu(eachMenu.createIterator());
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
            }
        }// while ends 
    }// menu print and Iterate

    public void printBreakfastMenu() {
    }

    public void printDinnerMenu() {
    }

    public boolean isItemVegetarian(String name) {
        Iterator menuArrayListIterator = this.myMenu.iterator();

        while (menuArrayListIterator.hasNext()) {
            Menu eachMenu = (Menu) menuArrayListIterator.next();
            System.out.println("\n\tChecking if " + name + " is Vegetarian in "+eachMenu.getMenuName() );
            if (isItemVegetarian(name, eachMenu.createIterator())) {
                return true;
            }
        }
        return false;
    } // check item vegetarian across all menu items (pick each menu and ask within each) 

    private boolean isItemVegetarian(String name, Iterator menuIterator) {
        while (menuIterator.hasNext()) {
            MenuItem mn = (MenuItem) menuIterator.next();
            if (mn != null) {
               //  System.out.println("Comparing : "+mn.getName()+ " - " + name );
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
        Iterator menuArrayListIterator = this.myMenu.iterator();

        while (menuArrayListIterator.hasNext()) {
            Menu eachMenu = (Menu) menuArrayListIterator.next();
            System.out.println("\t--------------------------");
            System.out.println("\t" + eachMenu.getMenuName());

            // Now for each Menu at hand, send the Iterator to Print Vegetarian MenuItems
            printVegetarianMenu(eachMenu.createIterator());
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
