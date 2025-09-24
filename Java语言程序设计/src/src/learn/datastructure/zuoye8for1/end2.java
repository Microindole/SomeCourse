package learn.datastructure.zuoye8for1;

import java.util.List;

public class end2 {
    public static boolean least9(boolean [] visited){
        int count = 0;
        for(boolean i : visited) {
            if(i) count++;if(count == 9) return true;
        }
        return false;
    }

    public static boolean dfsMustAB(int start, int a, int b, List<List<Integer>> linJie, boolean[] visited, List<Integer> path) {
        visited[start] = true;
        path.add(start);
        if(path.contains(a) && path.contains(b) && least9(visited))
            return true; // 找到路径
        for (int neighbor : linJie.get(start))
            if (!visited[neighbor])
                if (dfsMustAB(neighbor,a, b, linJie, visited, path))
                    return true;
        path.removeLast();// 路径后退一个点
        return false; // 未找到路径
    }
}
