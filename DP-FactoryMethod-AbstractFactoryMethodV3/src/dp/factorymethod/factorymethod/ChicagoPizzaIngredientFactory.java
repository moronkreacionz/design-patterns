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
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    private String name;

    public ChicagoPizzaIngredientFactory() {
        this.name = "Chicago Style";
    }
    
    /**
     *
     * @return
     */
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    /**
     *
     * @return
     */
    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    /**
     *
     * @return
     */
    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    /**
     *
     * @return
     */
    @Override
    public Clams createClams() {
        return new FrozenClams();
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
            new EggPlant(),
            new Spinach(),
            new BlackOlives()
        };
        return veggies;
    }

    public String getName() {
        return name;
    }

}
