/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.compositepattern.v6composites;

import java.util.Iterator;

/**
 *
 * @author moronkreacionz
 * @since Dec 2, 2015
 */
class Waitress {

    private String name; // Waitress Name
    private MenuComponent allMenus;

    public Waitress(String name) {
        this.name = name;
    }

    public Waitress(String name, MenuComponent argAllMenus) {
        this.name = name;
        this.allMenus = argAllMenus;
    }

    public void printMenu() {
        System.out.println("----------------------------------------");
        System.out.println("\tWaitress Name: "+this.getName() + "'s Menu printed:"); 
        this.allMenus.print();
        System.out.println("----------------------------------------");
    }// print menu ends 
 
    public void printVegetarianMenu() {
        System.out.println("----------------------------------------");
        System.out.println("\tWaitress Name: "+this.getName() + "'s Vegetarian Menu printed:"); 
        
        Iterator iteratorVegMenu = this.allMenus.createIterator();
        while(iteratorVegMenu.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iteratorVegMenu.next();
            try{
                if(menuComponent.isVegetarian())
                {
                    menuComponent.print();
                }
            }catch (UnsupportedOperationException ex) {}   
        }
        System.out.println("----------------------------------------");
    }// print Vegetarian menu ends 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuComponent getAllMenus() {
        return allMenus;
    }

    public void setAllMenus(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }
}
