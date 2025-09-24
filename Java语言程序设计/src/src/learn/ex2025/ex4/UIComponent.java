package learn.ex2025.ex4;

public class UIComponent {
    protected String backgroundColor = "blue";
    protected String label = "";

    public UIComponent() {}

    public UIComponent(String label, String backgroundColor) {
        this.label = label;
        this.backgroundColor = backgroundColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String render() {
        return "UIComponent: label=" + label + ", backgroundColor=" + backgroundColor;
    }
}