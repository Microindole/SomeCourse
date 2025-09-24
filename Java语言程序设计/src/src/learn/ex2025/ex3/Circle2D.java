package learn.ex2025.ex3;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y) {
        return Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2) < Math.pow(radius, 2);
    }

    public boolean contains(Circle2D circle) {
        return Math.pow(this.x - circle.x, 2) + Math.pow(this.y - circle.y, 2) < Math.pow(radius - circle.radius, 2);
    }

    public boolean overlaps(Circle2D circle) {
        return Math.pow(this.x - circle.x, 2) + Math.pow(this.y - circle.y, 2) < Math.pow(radius + circle.radius, 2);
    }

    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2,2,5.5);
        System.out.println("c1的面积为: " + c1.getArea()+"，周长为: " + c1.getPerimeter());
        if (c1.contains(3,3)) System.out.println("c1包含点(3,3)");
        else System.out.println("c1不包含点(3,3)");
        if (c1.contains(new Circle2D(4,5,10.5))) System.out.println("c1包含圆Circle2D(4,5,10.5)");
        else System.out.println("c1不包含圆Circle2D(4,5,10.5)");
        if (c1.overlaps(new Circle2D(3,5,2.3)))
            System.out.println("c1与圆心坐标为(3,5)，半径为2.3的圆相交");
        else System.out.println("c1不与圆心坐标为(3,5)，半径为2.3的圆相交");
    }
}
