/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.templatemethodpattern.v3withhooks;

/**
 *
 * @author moronkreacionz
 */
public class DPTemplateMethodPatternV3WithHooks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // CaffeineBeverage cb = new TeaWithHook();
        CoffeeWithHook c = new CoffeeWithHook();
        TeaWithHook t = new TeaWithHook();
        
        System.out.println("Making Coffee.. ");
        c.prepareRecipe();
        
        System.out.println("\n\n\nMaking Tea.. ");
        t.prepareRecipe();
        
        
    }
    
}
