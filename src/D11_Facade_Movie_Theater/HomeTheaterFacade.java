package D11_Facade_Movie_Theater;

public class HomeTheaterFacade {

    private Light light;
    private Projector projector;
    private SoundSystem soundSystem;

    public HomeTheaterFacade(Light light, Projector projector, SoundSystem soundSystem) {
        this.light = light;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }

    public void watchMovie(String movieName) {
        System.out.println("++++++++++ Starting Movie ++++++++++");
        light.dim(20);
        soundSystem.on();
        soundSystem.setVolume(50);
        projector.on();
        projector.setWideScreen();
        projector.playMovie(movieName);
        System.out.println("++++++++++ Enjoy your movie ++++++++++");
    }

    public void endMovie() {
        System.out.println("++++++++++ Ending Movie ++++++++++");
        light.on();
        projector.off();
        soundSystem.off();
        System.out.println("++++++++++ All devices turned OFF ++++++++++");
    }
}
