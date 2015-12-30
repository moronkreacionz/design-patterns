/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern.v4withcafemenu;

/**
 *
 * @author moronkreacionz
 */
public class DPIteratorPatternV4WithCafeMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Menu[] twoAliceMenus = {pancakeHouseMenu, dinerMenu};
        Waitress alice = new Waitress("Alice", twoAliceMenus);
        // OR Try this 
        // Waitress alice = new Waitress("Alice",pancakeHouseMenu, dinerMenu);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("Alice's menu printed:");
        alice.printMenu();
        System.out.println("---------------------------------------");

        System.out.println("---------------------------------------");
        Menu cafeMenu = new CafeMenu();
        Menu[] allLindaMenus = {pancakeHouseMenu, dinerMenu, cafeMenu};
        Waitress linda = new Waitress("Linda", allLindaMenus);
        System.out.println("Linda's menu printed:");
        linda.printMenu();
        System.out.println("---------------------------------------");

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        System.out.println("---------------------------------------");
        System.out.println("Linda's Vegetarian menu printed:");
        linda.printVegetarianMenu();
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("\nCustomer asks, is the Hotdog vegetarian?");
        System.out.print("Linda says: ");
        if (linda.isItemVegetarian("Hotdog")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println("---------------------------------------");
        System.out.println("\nCustomer asks, are the Waffles vegetarian?");
        System.out.print("Linda says: ");
        if (linda.isItemVegetarian("Waffles")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
    }
}
