/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.templatemethodpattern.v2caffeinebeverage;

/**
 *
 * @author moronkreacionz
 */
public class DPTemplateMethodPatternV2CaffeineBeverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // CaffeineBeverage cb = new Tea();
        Coffee c = new Coffee();
        Tea t = new Tea();
        
        t.prepareRecipe();
        c.prepareRecipe();
        
        // nothing done here.. 
        
        
    }
    
}
