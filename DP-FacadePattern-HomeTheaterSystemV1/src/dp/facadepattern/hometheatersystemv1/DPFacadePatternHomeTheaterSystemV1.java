/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.facadepattern.hometheatersystemv1;

/**
 *
 * @author moronkreacionz
 */
public class DPFacadePatternHomeTheaterSystemV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Tuner tuner = new Tuner();
        DVDPlayer dvd = new DVDPlayer();
        Amplifier amp = new Amplifier(dvd);
        CDPlayer cd = new CDPlayer(); 
        Projector projector = new Projector("Top-O-Line Projector"); 
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();
        HomeTheaterFacade hometheater = new HomeTheaterFacade(
                                        amp, tuner, dvd, cd, projector, 
                                        lights, screen, popper );
        

        System.out.println("----------------------------------------");
        System.out.println("Letting the new Home Theater Facade take charge of watching movie()");
        
        System.out.println("----------------------------------------");
        hometheater.watchMovie("Titanic");
        
        
        
        System.out.println("----------------------------------------");
        hometheater.endMovie();
        
        System.out.println("----------------------------------------");
    }

}
