package D11_Facade_Movie_Theater;

public class App {

    public static void main(String[] args) {

        Light hallLights = new Light();
        Projector projector = new Projector();
        SoundSystem surroundSound = new SoundSystem();

        HomeTheaterFacade theater = new HomeTheaterFacade(hallLights, projector, surroundSound);

        theater.watchMovie("Enter the Dragon");
        theater.endMovie();
    }
}
