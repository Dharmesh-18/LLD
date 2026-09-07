package D6_UI_Kit_Abstract_Factory;

public class MacCheckBox implements CheckBox {

    @Override
    public void toggle() {
        System.out.println("Mac CheckBox toggled.");
    }
}
