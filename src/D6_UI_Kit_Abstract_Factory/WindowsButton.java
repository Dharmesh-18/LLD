package D6_UI_Kit_Abstract_Factory;

public class WindowsButton implements Button {

    @Override
    public void click() {
        System.out.println("Windows Button clicked.");
    }
}
