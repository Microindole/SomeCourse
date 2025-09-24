package learn.review.ForExperiment.ex8;


public class Square extends GeometricObject  implements  Colorable{
    private final int numOfSize = 4;

    Square(){
        super();
    }

    Square(double size){
        super(size);
    }

    @Override
    public void howToColor(){
        System.out.println("给所有的四条边着色");
    }

    @Override
    public String toString(){
        return "该图形是可着色的，边长为: " + getSize();
    }

//    public

    public static void main(String[] args) {
        Object object = new Object();
        GeometricObject sq1 = new Square(30);
        GeometricObject sq2 = new Square();
        System.out.println(sq1);
        System.out.println(sq2);
        System.out.println(object);
    }
}
