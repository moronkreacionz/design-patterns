/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.decoratorpattern.v1;

/**
 *
 * @author moronkreacionz
 */
public class DPDecoratorPatternStarBuzzCoffeeExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("-- -- -- -- -- -- -- -- -- -- ");
        System.out.println(" ");
        System.out.println(" ");

        Beverage espressoBeverage = new Espresso();
        System.out.println("1st Beverage Name: " + espressoBeverage.getDescription()
                + ", $" + espressoBeverage.cost());

        System.out.println("-- -- -- -- -- -- -- -- -- -- ");
        System.out.println(" ");
        System.out.println(" ");

        Beverage darkRoastBeverage = new DarkRoast();
        darkRoastBeverage = new Mocha(darkRoastBeverage);
        darkRoastBeverage = new Mocha(darkRoastBeverage);
        darkRoastBeverage = new Whip(darkRoastBeverage);

        System.out.println("2nd Beverage Name: " + darkRoastBeverage.getDescription()
                + ", $" + darkRoastBeverage.cost());

        System.out.println("-- -- -- -- -- -- -- -- -- -- ");
        System.out.println(" ");
        System.out.println(" ");

        Beverage houseBlendBeverage = new HouseBlend();
        houseBlendBeverage = new Soy(houseBlendBeverage);
        houseBlendBeverage = new Mocha(houseBlendBeverage);
        houseBlendBeverage = new Whip(houseBlendBeverage);
        houseBlendBeverage = new SteamedMilk(houseBlendBeverage);

        System.out.println("3rd Beverage Name: " + houseBlendBeverage.getDescription()
                + ", $" + houseBlendBeverage.cost());
        System.out.println("-- -- -- -- -- -- -- -- -- -- ");
        System.out.println(" ");

    }

}
