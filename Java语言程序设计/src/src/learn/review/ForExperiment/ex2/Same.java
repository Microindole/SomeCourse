package learn.review.ForExperiment.ex2;

import java.util.Arrays;

public class Same {
    public static void main(String[] args) {
        int [] arr1 = {1,2,2,3,4,4,4,5};int [] arr2 = {5,4,4,2,3,2,6,4};
        System.out.println(same(arr1,arr2));
    }

    public static boolean same(int [] arr1, int [] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (arr1.length != arr2.length) return false;
        else{
            for(int i = 0; i< arr1.length; i++){
                if (arr1[i] != arr2[i]) return false;
            }return true;
        }
    }
}
