package learn.datastructure;

public class GetFatherChar {
    public static void getFatherChar(int index,char[] tree){
        while(index / 2 >0){
            index /= 2;
            System.out.println(tree[index-1]);
        }
    }


    // 下标从1开始
    public static int getSameFather(int index1,int index2){
       if (index1 == index2){
           return index1 / 2 - 1;
       }while (index1 != index2){
           index1 /= 2;index2 /= 2;
       }return index1;
   }

    public static void main(String[] args) {
        char[] tree = {'a','b','c','d','e','f','g'};
        getFatherChar(6,tree);
        System.out.println(getSameFather(4,5));
    }
}
