package learn.datastructure.zuoye8for1;

public class CountRuDu {
    // 下标从0开始
    public static int countRuDu(int [][] arr, int lie){
        int count  = 0;
        int lengthLie = arr[0].length;
        if(arr.length != lengthLie){
            System.out.println("该数组不是一个邻接矩阵！");
            return -1;
        }else{
            for (int[] int1 : arr) {
                count += int1[lie];
            }
            return count;
        }
    }

    public static void main(String [] args){
        int[][] mar = {{0,1,0,0,1},
                       {1,0,0,1,0},
                       {1,1,0,0,1},
                       {1,1,1,0,1},
                       {0,1,0,1,0}};
        System.out.println(countRuDu(mar,4));
    }
}
