package learn.datastructure;

import java.util.Scanner;

public class GetIndexI {

    /**
     *
     * @param index 是索引的下标，从0开始
     * @return 返回该索引的层数
     */
    public static int GetIndex(int index){
        int floor = 1;
        while(index / 2 > 0){
            index /= 2;
            floor+=1;
        }
        return floor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        i = scanner.nextInt();
        System.out.println(GetIndex(i));

    }
}
