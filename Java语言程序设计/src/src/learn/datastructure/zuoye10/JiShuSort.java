import java.util.Arrays;

public class JiShuSort {
    public static int[] sort(int[] A) {
        int n = A.length;
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (A[j] < A[i]) {
                    count++;
                }
            }
            B[count] = A[i];
        }
        return B;
    }

    public static void main(String[] args) {
        // 待排序的原始数组
        int[] inputArray = {25, 84, 21, 47, 15, 27, 68, 35, 20};
        
        System.out.println("原始数组: " + Arrays.toString(inputArray));

        // 调用排序算法
        int[] sortedArray = sort(inputArray);

        // 打印排序后的结果
        System.out.println("排序后数组: " + Arrays.toString(sortedArray));
    }
}