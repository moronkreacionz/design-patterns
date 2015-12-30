/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.templatemethodpattern.v4sortingducks;

/**
 *
 * @author moronkreacionz
 * @since Dec 1, 2015
 */
class Duck implements Comparable <Duck>{

    private String name;
    private int weight;

    public Duck() {
        this.name = "noname";
        this.weight = 2;

    }

    public Duck(String name) {
        this.name = name;
        this.weight = 2;
    }

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Duck{" + "name=" + this.name + ", weight=" + this.weight + '}';
    }

    /* public int compareTo(String anotherString) {
     return name.compareTo(anotherString);
     }

     public int compareToIgnoreCase(String str) {
     return name.compareToIgnoreCase(str);
     }
 
     public int compareTo(Duck object) {
     Duck otherDuck = object;

     if (this.weight < otherDuck.weight) {
     return -1;
     } else if (this.weight == otherDuck.weight) {
     return 0;
     } else { // this.weight > otherDuck.weight 
     return 1;
     }
     } 
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getName() {
        return this.name;
    }

    // public int compareTo(Object object) {
        // Duck otherDuck = (Duck) object;

    @Override
    public int compareTo(Duck object) {
        Duck otherDuck =  object;

        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {
            return 0;
        } else { // this.weight > otherDuck.weight 
            return 1;
        }
    } 

}
