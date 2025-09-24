package learn.ex2025.ex8;

public class Circle {
    private double radius;
    private final double PI = 3.14159;

    Circle(){
        this.radius = 1;
    }

    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return PI * radius * radius;
    }

    public String toString(){
        return "这是一个半径为："+radius+"的圆";
    }


}
