package learn.classes.ClassTest;

import java.io.File;


public class TestMain {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] array = new int[2];
        int i = 0,j = 0;

        for (i = 0;i<length;i++){
            for(j = 0;j<length;j++){
                if (nums[i] + nums[j] == target){
                    array[0] = i;array[1] = j;
                    return array;}
            }
        }
        array[0] = -1;array[1] = -1;
        return array;
    }

    public static void main(String[] args) {
        int[] array = {2,7,11,15};
        int target = 989;
        TestMain testMain = new TestMain();
        int[] arr =  testMain.twoSum(array,target);
        System.out.println("{"+arr[0]+","+arr[1]+"}");
    }
}
