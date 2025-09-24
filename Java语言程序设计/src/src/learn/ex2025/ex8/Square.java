package learn.ex2025.ex8;

public class Square extends GeometricObject implements Colorable{

    Square(){
        super();
    }

    Square(String color, boolean filled){
        super(color, filled);
    }

    @Override
    public void howToColor() {
        System.out.println("给所有的四条边着色");
    }

    public String toString(){
        return "正方形的颜色为："+getColor()+", 是否上色："+isFilled();
    }
}
