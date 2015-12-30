/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern.v3withjavaiterator;

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

    public Waitress(String name) {
        this.name = name;
        this.pancakeHouseMenu = new PancakeHouseMenu();
        this.dinerMenu = new DinerMenu();
    }

    public Waitress(String name, Menu pancakeHouseMenu, Menu dinerMenu) {
        this.name = name;
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        // we dont use the getMenuItems method as implemented earlier ..
        // ArrayList breakfastItems = this.pancakeHouseMenu.getMenuItems();
        // MenuItem[] lunchItems = this.dinerMenu.getMenuItems();

        Iterator breakfastIterator = this.pancakeHouseMenu.createIterator();
        Iterator lunchIterator = this.dinerMenu.createIterator();

        System.out.println("\t--------------------------");
        System.out.println("\tMenu Breakfast");
        printMenu(breakfastIterator);
        System.out.println("\t--------------------------");
        System.out.println("\tLunch");
        printMenu(lunchIterator);

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
        // detects if the item matchin "name" is vegetarian true or false.
        return true;
    }

    public void printVegetarianMenu() {

        Iterator breakfastIterator = this.pancakeHouseMenu.createIterator();
        Iterator lunchIterator = this.dinerMenu.createIterator();

        System.out.println("\t--------------------------");
        System.out.println("\tPrinting Vegetarian : Breakfast Menu");
        printVegetarianMenu(breakfastIterator);
        System.out.println("\t--------------------------");
        System.out.println("\tPrinting Vegetarian : Lunch Menu");
        printVegetarianMenu(lunchIterator);

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
