/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.factorymethod.factorymethod;

/**
 *
 * @author moronkreacionz
 */
public interface PizzaIngredientFactory {
    
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Clams createClams();
    public Pepperoni createPepperoni();
    public Veggies[] createVeggies();
    public String getName();
    
}
