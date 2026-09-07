package D6_UI_Kit_Abstract_Factory;

import java.util.Scanner;

public class App {

    private final Button button;
    private final CheckBox checkBox;

    public App(GuiFactory factory) {
        this.button = factory.createButton();
        this.checkBox = factory.createCheckBox();
    }

    public void renderUI() {
        button.click();
        checkBox.toggle();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Select the OS:");
        System.out.println("1. Mac");
        System.out.println("2. Windows");

        int choice = sc.nextInt();

        GuiFactory factory;

        if(choice == 1) {
            factory = new MacUiFactory();
        } else if(choice == 2) {
            factory = new WindowsUiFactory();
        } else {
            throw new IllegalArgumentException("Unsupported OS provided!");
        }


        App app = new App(factory);
        app.renderUI();

    }
}
