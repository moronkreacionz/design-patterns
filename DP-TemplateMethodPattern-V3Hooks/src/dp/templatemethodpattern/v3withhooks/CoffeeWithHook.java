/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.templatemethodpattern.v3withhooks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author moronkreacionz
 * @since Nov 30, 2015
 */
class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput(); 
        
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null; 
        System.out.println("Would you like Milk and Sugar with your Coffee (y/n)? ");
        
        // Keyboard Input Stream from Keyboard/System.in
        BufferedReader is = new BufferedReader(
                new InputStreamReader(
                        System.in
                )
        );
        try{
            answer = is.readLine();
        }catch (IOException ioe){
            System.err.println("IO error trying to read your answer");
        }
        
        if(answer == null){ 
            return "no";
        } 
        return answer; 
    }
}
