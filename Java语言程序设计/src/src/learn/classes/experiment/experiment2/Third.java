package learn.classes.experiment.experiment2;

import java.util.Scanner;

public class Third {


    public static int indexofSmallestElement(double[] array){
        int length = array.length;
        int index = 0;
        for(int i=0; i<length; i++){
            if(array[i] < array[index]){
                index = i;
            }
        }return index;
    }

    public static void main(String[] args) {
        double[] array = new double[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("输入10个数字:");
        for (int i = 0; i < 10; i++)
            array[i] = sc.nextDouble();
        sc.close();
        System.out.println("返回最小元素的下标:");
        int index = Third.indexofSmallestElement(array);
        System.out.println(index);
    }
}
