package learn.ex2025.ex2;

import java.util.Scanner;

public class ex0204 {
    public static boolean isPermutation(int[] a, int[] b){
        if( a.length != b.length)
            return false;
        else{
            sortArray(a);
            sortArray(b);
            for(int i = 0;i<a.length;i++){
                if (a[i] != b[i])
                    return false;
            }
            return true;
        }
    }

    public static void sortArray(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入数组1：(以单个空格分隔)");
        String[] input1 = sc.nextLine().split(" ");
        int[] array1 = new int[input1.length];
        for (int i = 0; i < input1.length; i++) {
            array1[i] = Integer.parseInt(input1[i]);
        }
        System.out.println("输入数组2：(以单个空格分隔)");
        String[] input2 = sc.nextLine().split(" ");
        int[] array2 = new int[input2.length];
        for (int i = 0; i < input2.length; i++) {
            array2[i] = Integer.parseInt(input2[i]);
        }
         boolean result = isPermutation(array1,array2);
        if (result)
            System.out.println("这两个数组是元素组合");
        else{
            System.out.println("这两个数组不是元素组合");
        }

    }
}
