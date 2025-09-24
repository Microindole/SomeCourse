package learn.ex2025.ex3;

public class RegularPolygon {

    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon(){
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n,double side){
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n,double side,double x,double j){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = j;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getPerimeter(){
        return n * side;
    }

    public double getArea(){
        return n * Math.pow(side, 2) / (4 * Math.tan(Math.PI / 4));
    }

    public static void main(String[] args) {
        RegularPolygon regularPolygon1 = new RegularPolygon(6,4);
        RegularPolygon regularPolygon2 = new RegularPolygon(10,4,5.6,7.8);
        System.out.println("RegularPolygon(6,4)的周长为："+regularPolygon1.getPerimeter()+"\t面积为："+regularPolygon1.getArea());
        System.out.println("RegularPolygon(10,4,5.6,7.8)的周长为："+regularPolygon2.getPerimeter()+"\t面积为："+regularPolygon2.getArea());
    }
}
