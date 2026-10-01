package D11_Facade_Movie_Theater;

public class SoundSystem {

    public void on() {
        System.out.println("Sound system is ON!");
    }

    public void setVolume(int level) {
        System.out.println("Setting sound system to " + level + "%");
    }

    public void off() {
        System.out.println("Sound system is OFF!");
    }
}
