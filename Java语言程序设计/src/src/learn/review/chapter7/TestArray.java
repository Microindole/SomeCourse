package learn.review.chapter7;

import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        int [] a ={1,2,3};
        printArray(a);
        printArray(reverse(a));
    }

    public static void printArray(int []list){
        for(int i: list)
            System.out.print(i+"\t");
        System.out.println();
    }

    public static int [] reverse(int [] list){
        int [] result = new int[list.length];
        for(int i = 0,j = result.length-1;i< list.length;i++,j--){
            result[j] = list[i];
        }
        return result;
    }

    public static void test1(){
        int[] a = new int[3];
        int [] b = {1,2,3};
        a=b;
        int[] c = new int[3];
        System.arraycopy(b, 0, c, 0, b.length);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));

    }
}
