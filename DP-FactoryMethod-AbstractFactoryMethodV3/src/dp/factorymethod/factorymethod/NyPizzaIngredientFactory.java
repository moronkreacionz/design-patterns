/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.factorymethod.factorymethod;

/**
 *
 * @author moronkreacionz
 * @since Nov 17, 2015
 */
public class NyPizzaIngredientFactory implements PizzaIngredientFactory {

    private String name; 
    public NyPizzaIngredientFactory(){
        this.name = "New York Style";
    }
    /**
     *
     * @return
     */
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    /**
     *
     * @return
     */
    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    /**
     *
     * @return
     */
    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    /**
     *
     * @return
     */
    @Override
    public Clams createClams() {
        return new FreshClams();
    }

    /**
     *
     * @return
     */
    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    /**
     *
     * @return
     */
    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {
            new Garlic(),
            new Onion(),
            new Mushroom(),
            new RedPepper()
        };
        return veggies;
    }

    public String getName() {
        return name;
    }

}
