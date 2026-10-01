package D11_Facade_Movie_Theater;

public class Projector {

    public void on() {
        System.out.println("Projector is ON!");
    }

    public void setWideScreen() {
        System.out.println("Setting projector to 16:9 widescreen mode.");
    }

    public void playMovie(String movieName) {
        System.out.println("Playing movie: " + movieName);
    }

    public void off() {
        System.out.println("Projector is OFF!");
    }
}
