package learn.classes.experiment.experiment1;

import java.util.Random;

public class Second {
    public static void main(String[] args) {
        String [] daoXiao ={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        String [] huaSe = {"Clubs","Diamond","Heart","Spades"};
        Random rand = new Random();
        int num1 = rand.nextInt(daoXiao.length);
        int num2 = rand.nextInt(huaSe.length);
        System.out.println("提示牌的花色为:"+huaSe[num2]);
        System.out.println("大小为:"+daoXiao[num1]);

    }
}
