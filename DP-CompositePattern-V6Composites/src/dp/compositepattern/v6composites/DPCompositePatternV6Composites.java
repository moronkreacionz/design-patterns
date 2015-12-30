/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.compositepattern.v6composites;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author moronkreacionz
 */
public class DPCompositePatternV6Composites {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MenuComponent pancakeHouseMenu = new Menu("BREAKFAST MENU", "Special PanCakeHouse Menu");
                        pancakeHouseMenu.add( new MenuItem("K & B Pancake Breakfast", 
                                "Pancakes with scrambled eggs and toast", true, 2.99));
                        pancakeHouseMenu.add( new MenuItem("Regular Pancake Breakfast", 
                                "Pancakes with fried eggs and sausage", false, 2.99));
                        pancakeHouseMenu.add( new MenuItem("Blueberry Pancakes", 
                                "Pancake made with fresh blueberries", true, 2.49));
                        pancakeHouseMenu.add( new MenuItem("Waffles", 
                                "Waffles, with your choice of blueberries", true, 3.59));
        
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Deessserrrt offCourse!!");
                        dessertMenu.add( new MenuItem( "Raasso Gulla", 
                                        "Red Brown, gol matol raasbhara rasodar rasogulla", 
                                true, 13.99));
                        dessertMenu.add( new MenuItem( "Gajaar Ka Halwa", 
                                        "Laal kajudar, gheewala, homemade style gajar ka halwa",  
                                false, 10.69));
                        dessertMenu.add( new MenuItem( "Dudhi Ka Mawa Halwa", 
                                        "Special long green Dudhi with mawa halwa",
                                false,7.29));
       
        MenuComponent dinerMenu = new Menu("LUNCH MENU", "Exclusive Diner Chef Menu");
       
                        dinerMenu.add( new MenuItem("Vegetarian BLT", 
                                "(Fakin') Bacon with lettuce and tomato on whole wheat",  
                                true, 2.99));
                        dinerMenu.add( new MenuItem( "BLT", 
                                "Bacon with lettuce and tomato on whole wheat",  
                                false, 2.99));
                        dinerMenu.add( new MenuItem( "Soup of the day", 
                                "Soup of the day, with a side of potato salad",  
                                false, 3.29));
                        dinerMenu.add( new MenuItem( "HotDog", 
                                "A hot dog, with saurkraut, relish, onions, topped with cheese",  
                                false, 3.05));
                        dinerMenu.add( dessertMenu );
                            // OBSERVE THIS, a submenu added to a parent menu - this shows tree hierarchy 

        MenuComponent cafeMenu = new Menu("DINNER MENU", "Splashing Cafe Menu");
                        cafeMenu.add( new MenuItem( "Veggie Burger and Air Fries", 
                                        "Veggie Burger on a whole wheat bun, tomato and fries", 
                                        true, 3.99));
                        cafeMenu.add( new MenuItem( "Soup of the day", 
                                        "A cup of the Soup of the day, with a side salad",  
                                        false, 3.69));
                        cafeMenu.add( new MenuItem( "Burrito", 
                                        "A large burrito, with whole pinto beans, salse, guacamole",
                                        false,4.29));

        
        
        MenuComponent twoAliceMenus = new Menu("Alice's Menu", 
                                        "Has Pancake and Diner Chef Special");
        twoAliceMenus.add(pancakeHouseMenu);
        twoAliceMenus.add(dinerMenu);
        
        
        testCompositeIterator(twoAliceMenus);
        
        System.out.println("----\n\n\n\n\n\n");
        
        Waitress alice = new Waitress("Alice", twoAliceMenus);
        alice.printMenu();
        
        
        MenuComponent allLindaMenus = new Menu("Linda's Menus", 
                                        "Has 3 Special Pancake, Diner Chef and Cafe Supremo");
        allLindaMenus.add(pancakeHouseMenu);
        allLindaMenus.add(dinerMenu);
        allLindaMenus.add(cafeMenu);
        
        Waitress linda = new Waitress("Linda", allLindaMenus);
        linda.printMenu();
        
        // Menu alternateDinerMenu = new Menu("AlternateDay Special Menu", 
                            // "Special Alternate Chef Dinner Menu");
        // alternateDinerMenu.setAlternateDays(true);
        // TODO: find how to make alternateDinerMenu
        
        MenuComponent allKimMenus = new Menu("Kim's Menus", 
                                        "Has 3 Exclusive Pancake, Diner Chefoo and Cafe Grande");
        allKimMenus.add(pancakeHouseMenu);
        allKimMenus.add(dinerMenu);
        allKimMenus.add(cafeMenu);

        Waitress kim = new Waitress("Kim", allKimMenus);
        kim.printMenu();
        
        System.out.println("Vegetarian menu printed:");
        kim.printVegetarianMenu();  // 
        // this function implements an external iterator 
        // chk the flow of CompositeIterator implemented in the printVegetarianMenu()
        
        /* 
        // TODO: all below items are todo :
        System.out.println("\nCustomer asks, is the Hotdog vegetarian?");
        System.out.print("kim says: ");
        if (kim.isItemVegetarian("Hotdog")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println("");
        System.out.println("\nCustomer asks, are the Waffles vegetarian?");
        System.out.print("kim says: ");
        if (kim.isItemVegetarian("Waffles")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        */ 
    }
    
    public static void testCompositeIterator(MenuComponent ArgComponent){
        CompositeIterator iterator = new CompositeIterator( ArgComponent.createIterator());
        while(iterator.hasNext()){
            MenuComponent component = (MenuComponent) iterator.next();
            System.out.println("Component"+ component);
        }
        
    }
    
}
