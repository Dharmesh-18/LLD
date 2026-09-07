package D6_UI_Kit_Abstract_Factory;

public class WindowsCheckBox implements CheckBox {

    @Override
    public void toggle() {
        System.out.println("Windows CheckBox toggled.");
    }
}
