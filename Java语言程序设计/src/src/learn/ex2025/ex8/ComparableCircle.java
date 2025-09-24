package learn.ex2025.ex8;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{

    ComparableCircle(){
        super();
    }

    ComparableCircle(double radius){
        super(radius);
    }


    @Override
    public int compareTo(ComparableCircle comparableCircle2) {
        return Double.compare(this.getArea(), comparableCircle2.getArea());
    }

    public String toString(){
        return "半径为：" + this.getRadius() + "的圆";
    }


    public static void main(String[] args) {
        ComparableCircle comparableCircle1 = new ComparableCircle(12);
        ComparableCircle comparableCircle2 = new ComparableCircle(15);
        int result = comparableCircle1.compareTo(comparableCircle2);
        String larger= "";
        switch (result){
            case 1:
                larger = comparableCircle1+"面积大于"+comparableCircle2;
                break;
            case 0:
                larger = comparableCircle1+"面积等于"+comparableCircle2;
                break;
            case -1:
                larger = comparableCircle1+"面积小于"+comparableCircle2;
                break;
            default:
                break;
        }
        System.out.println(larger);

    }
}
