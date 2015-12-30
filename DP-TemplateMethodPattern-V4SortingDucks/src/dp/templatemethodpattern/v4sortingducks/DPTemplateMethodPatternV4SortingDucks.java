/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.templatemethodpattern.v4sortingducks;

import java.util.Arrays;
 

/**
 *
 * @author moronkreacionz
 */
public class DPTemplateMethodPatternV4SortingDucks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Duck[] ducks = {
                        new Duck("Naive", 6),
                        new Duck("Timmy", 34),
                        new Duck("Rocker", 2),
                        new Duck("Bluffy", 12),
                        new Duck("Smurfyie", 32),
                        new Duck("Navelle", 62),
                        new Duck("Rafailey", 16)
                        };

        System.out.println("\n\nUnSorted ducks");
        display(ducks);
        
        
        System.out.println("\nSorting now");
        Arrays.sort(ducks);
        System.out.println("\nSorting done");
        
        
        System.out.println("\n\nSorted Ducks");
        display(ducks);

    }
    
    public static void display(Duck[] ducks)
    {
        for (int i = 0; i < ducks.length; i++) {
            System.out.println("Duck Name[" + i + "]: --" + ducks[i]);
        }
    }
}
