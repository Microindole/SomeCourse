package learn.datastructure.zuoye8for1;

import java.util.List;

public class isIJ {
    public static boolean isIJ(List<List<Integer>> linJie,int i,int j){
        int size = linJie.get(i).size();
        for(int index = 0;index < size;index++)
            if(linJie.get(i).get(index) == j)
                return true;
        return false;
    }
}
