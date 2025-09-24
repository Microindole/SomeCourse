package learn.ex2025.ex4;

public class Button extends UIComponent {
    private String shape = "round";
    private boolean isDisabled = false;

    public Button() {
        super();
    }

    public Button(String label, String backgroundColor, String shape, boolean isDisabled) {
        super(label, backgroundColor);
        this.shape = shape;
        this.isDisabled = isDisabled;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public boolean isDisabled() {
        return isDisabled;
    }

    public void setDisabled(boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    public void click() {
        if (isDisabled) {
            System.out.println("Button [" + label + "] is disabled and cannot be clicked.");
        } else {
            System.out.println("Button [" + label + "] clicked!");
        }
    }

    @Override
    public String render() {
        return "Button: label=" + label +
                ", shape=" + shape +
                ", backgroundColor=" + backgroundColor +
                ", isDisabled=" + isDisabled;
    }

    public static void main(String[] args) {
        Button button1 = new Button();
        button1.click();
        button1.render();
        Button button2 = new Button("登录","yellow","rectangle",true);
        button2.click();
        button2.render();
    }
}
