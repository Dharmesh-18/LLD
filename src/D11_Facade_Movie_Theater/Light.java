package D11_Facade_Movie_Theater;

public class Light {

    public void dim(int level) {
        System.out.println("Dimming lights to " + level + "%");
    }

    public void on() {
        System.out.println("Lights are fully ON!");
    }

}
