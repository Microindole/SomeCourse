package learn.ex2025.ex6;
public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    Triangle(){
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }
    Triangle(double side1, double side2, double side3) throws IllegalTriangleException{
        if(side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1){
            throw new IllegalTriangleException(side1+','+side2+','+side3+"这三边无法构成的三角形");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide3() {return side3; }
    public void setSide3(double side3) {this.side3 = side3;}
    public double getSide1() {return side1;}
    public void setSide1(double side1) {this.side1 = side1;}
    public double getSide2() {return side2;}
    public void setSide2(double side2) {this.side2 = side2;}
    public double getArea(){
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    public double getPerimeter(){return side1 + side2 + side3;}
    public String toString(){
        return "该三角形的三条边分别为：" + side1 + '\t' + side2 + '\t' + side3 + '\n' +
                "面积为：" + getArea() + '\n' + "周长为：" + getPerimeter();
    }
    public static void main(String[] args) {
        try{
            Triangle t1 = new Triangle();
            System.out.println(t1.toString());
            Triangle t2 = new Triangle(3,4,5);
            System.out.println(t2.toString());
            Triangle t3 = new Triangle(1,2,3);
            System.out.println(t3.toString());
        }catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }
    }
}
