package learn.ex2025.ex2;

import java.util.Scanner;

public class ex0202 {

    public static int  lastIndexOfMax(int[] array){
        int maxNum = 0;
        int index = 0;
        for(int i = 1; i < array.length; i++){
            if(array[i] > maxNum){
                maxNum = array[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入10个数字：");
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
        }
        int note =  lastIndexOfMax(array);
        System.out.println("最大元素的下标为 "+note+"\n"+"这个数为 "+array[note]+"\n");
    }
}
