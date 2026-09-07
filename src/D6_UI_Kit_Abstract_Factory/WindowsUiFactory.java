package D6_UI_Kit_Abstract_Factory;

public class WindowsUiFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
