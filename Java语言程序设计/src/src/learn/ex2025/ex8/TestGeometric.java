package learn.ex2025.ex8;

public class TestGeometric {
    public static void main(String[] args) {
        Object[] objects = new Object[5];
        objects[0] = new Square("红色", true);
        objects[1] = new Square("蓝色",false);
        objects[2] = new Square("绿色", true);
        objects[3] = new Circle(12);
        objects[4] = new Square("黄色", true) {
        };

        for (int i = 0; i < objects.length; i++) {
            System.out.println("对象 " + (i + 1) + ": " + objects[i].toString());
            if (objects[i] instanceof Colorable) {
                System.out.print("该对象是可着色的: ");
                ((Colorable) objects[i]).howToColor();
            } else {
                System.out.println("该对象不可着色。");
            }
        }
    }
}