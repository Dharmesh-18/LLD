package D6_UI_Kit_Abstract_Factory;

public class MacUiFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
