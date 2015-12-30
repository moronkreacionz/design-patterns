/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern.v5withmenuarraylist;

import java.util.ArrayList;

/**
 *
 * @author moronkreacionz
 */
public class DPIteratorPatternV5WithMenuArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Menu pancakeHouseMenu = new PancakeHouseMenu();
        pancakeHouseMenu.setMenuName("Breakfast Menu");
        
        Menu dinerMenu = new DinerMenu();
        dinerMenu.setMenuName("Lunch Menu");
        
        // Menu[] twoAliceMenus = {pancakeHouseMenu, dinerMenu};
        ArrayList twoAliceMenus = new ArrayList();
            twoAliceMenus.add(pancakeHouseMenu);
            twoAliceMenus.add(dinerMenu);
        
        Waitress alice = new Waitress("Alice",twoAliceMenus);
        // OR Try this 
        // Waitress alice = new Waitress("Alice",pancakeHouseMenu, dinerMenu);
        
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("Alice's menu printed:");
        alice.printMenu();
        System.out.println("---------------------------------------");
        
        System.out.println("---------------------------------------");
        Menu cafeMenu = new CafeMenu();
        cafeMenu.setMenuName("Dinner Menu");
        
        // Menu[] allLindaMenus = {pancakeHouseMenu, dinerMenu , cafeMenu};
        ArrayList allLindaMenus = new ArrayList();
            allLindaMenus.add(pancakeHouseMenu);
            allLindaMenus.add(dinerMenu);
            allLindaMenus.add(cafeMenu);
        
        Waitress linda = new Waitress("Linda", allLindaMenus);
        System.out.println("Linda's menu printed:");
        linda.printMenu();
        System.out.println("---------------------------------------");

        
        System.out.println("---------------------------------------");
        Menu alternateDinerMenu = new DinerMenu();
        alternateDinerMenu.setMenuName("Special Alternate Chef Dinner Menu");
        alternateDinerMenu.setAlternateDays(true);
        // Menu[] allKimMenus = {pancakeHouseMenu, alternateDinerMenu, cafeMenu};
        
        ArrayList allKimMenus = new ArrayList();
            allKimMenus.add(pancakeHouseMenu);
            allKimMenus.add(alternateDinerMenu);
            allKimMenus.add(cafeMenu);

        Waitress kim = new Waitress("Kim", allKimMenus);
        System.out.println("Kim's menu printed:");
        kim.printMenu();
        System.out.println("---------------------------------------");
        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("kim's Vegetarian menu printed:");
        kim.printVegetarianMenu();
        System.out.println("---------------------------------------");
        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("\nCustomer asks, is the Hotdog vegetarian?");
        System.out.print("kim says: ");
        if (kim.isItemVegetarian("Hotdog")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("\nCustomer asks, are the Waffles vegetarian?");
        System.out.print("kim says: ");
        if (kim.isItemVegetarian("Waffles")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
    }
    
}
