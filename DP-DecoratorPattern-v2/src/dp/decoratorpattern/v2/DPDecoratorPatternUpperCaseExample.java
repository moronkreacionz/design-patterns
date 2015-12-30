/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.decoratorpattern.v2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * @author moronkreacionz
 */
public class DPDecoratorPatternUpperCaseExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c;
        try {
            InputStream in
                    = new DPLowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("/Users/moronkreacionz/Code/design-patterns/DP-DecoratorPattern-v2/src/dp/decoratorpattern/v2/test.txt")
                            )
                    );
            System.out.println("");
            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
            System.out.println("");
            System.out.println("");
            in.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
