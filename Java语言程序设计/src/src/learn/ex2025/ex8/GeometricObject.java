package learn.ex2025.ex8;

public class GeometricObject {
    private String color;
    private boolean filled;

    GeometricObject(){
        this.color = "blue";
        this.filled = true;
    }

    GeometricObject(String color,boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString(){
        return "color is"+ getColor()+", and filled state"+ filled;
    }
}
