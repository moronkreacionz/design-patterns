/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.facadepattern.hometheatersystemv1;

/**
 *
 * @author moronkreacionz
 * @since Nov 30, 2015
 */
class HomeTheaterFacade {

    Amplifier amp;
    Tuner tuner;
    DVDPlayer dvd;
    CDPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;
    String movieName;

    HomeTheaterFacade(
            Amplifier amp,
            Tuner tuner,
            DVDPlayer dvd,
            CDPlayer cd,
            Projector projector,
            TheaterLights lights,
            Screen screen,
            PopcornPopper popper
    ) {
        this.dvd = dvd;
        this.amp = amp;
        this.tuner = tuner;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;

    }

    void watchMovie(String movieName) {
        this.movieName = movieName;
        System.out.println("Get ready to watch this Movie: \"" + movieName + "\"" );
        this.popper.on();
        this.popper.pop();
        this.lights.dim();
        this.screen.down();
        this.projector.on();
        this.projector.wideScreenMode();
        this.amp.on();
        this.amp.setDVD(this.dvd);
        this.amp.setSurroundSound();
        this.amp.setVolume(5);
        this.dvd.on();
        this.dvd.play(movieName);
    }

    void endMovie() {
        System.out.println("\n\nThanks for watching, \"" + this.movieName + "\", shutting down");
        this.popper.off();
        this.lights.on();
        this.screen.up();
        this.projector.off();
        this.amp.off();
        this.dvd.stop();
        this.dvd.eject();
        this.dvd.off();
    }

}
