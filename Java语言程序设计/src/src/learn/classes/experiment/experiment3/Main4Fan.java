package learn.classes.experiment.experiment3;

public class Main4Fan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        fan2.setSpeed(fan2.MEDIUM);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}