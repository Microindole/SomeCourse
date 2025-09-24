package learn.datastructure.zuoye8for1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections; // 用于返回空列表

public class end1 {
    public static boolean dfs(int u, int v,
                                        List<List<Integer>> linJie,
                                        boolean[] visited,
                                        List<Integer> path) {
        visited[u] = true;
        path.add(u);
        if (u == v)
            return true; // 找到路径
        for (int neighbor : linJie.get(u))
            if (!visited[neighbor])
                if (dfs(neighbor, v, linJie, visited, path))
                    return true;
        path.remove(path.size() - 1);// 路径后退一个点
        return false; // 未找到路径
    }

    public static List<Integer> findPath(int numVertices, List<List<Integer>> linJie,
                                         int startNode, int v) {

        // 基本的边界和有效性检查
        if (startNode < 0 || startNode >= numVertices || v < 0 || v >= numVertices) {
            System.err.println("错误：起始或结束节点索引越界。");
            return Collections.emptyList();
        }
        if (linJie == null || linJie.size() != numVertices) {
            System.err.println("错误：邻接表为空或大小与顶点数不符。");
            return Collections.emptyList();
        }


        boolean[] visited = new boolean[numVertices]; // 初始化visited数组，默认为false
        List<Integer> pathResult = new ArrayList<>();   // 用于存储最终路径

        if (dfs(startNode, v, linJie, visited, pathResult)) {
            return pathResult; // 找到了路径
        } else {
            return Collections.emptyList(); // 未找到路径
        }
    }

    // 辅助方法，用于在无向图中添加边
    private static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // 因为是无向图，所以需要双向添加
    }

    public static void main(String[] args) {
        int V = 7; // 顶点数量
        List<List<Integer>> adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // 构建图的边 (无向图)
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 5);
        // 顶点6是孤立的，除非我们添加边 adj.get(2).add(6) 或其他
        // 为了演示能找到路径和找不到路径的情况，我们先不连接顶点6到其他主要部分

        System.out.println("图的邻接表表示:");
        for (int i = 0; i < V; i++) {
            System.out.println("顶点 " + i + ": " + adj.get(i));
        }
        System.out.println();

        int u1 = 0;
        int v1 = 4;
        System.out.println("查找从顶点 " + u1 + " 到顶点 " + v1 + " 的路径:");
        List<Integer> path1 = findPath(V, adj, u1, v1);
        if (path1.isEmpty()) {
            System.out.println("未找到路径。");
        } else {
            System.out.println("找到路径: " + path1); // 期望: [0, 1, 4] 或其他有效路径
        }
        System.out.println();

        int u2 = 3;
        int v2 = 5;
        System.out.println("查找从顶点 " + u2 + " 到顶点 " + v2 + " 的路径:");
        List<Integer> path2 = findPath(V, adj, u2, v2);
        if (path2.isEmpty()) {
            System.out.println("未找到路径。"); // 期望: 未找到路径，因为3和5在当前图中不连通
        } else {
            System.out.println("找到路径: " + path2);
        }
        System.out.println();

        // 连接之前不连通的部分，例如通过 4 和 5
        addEdge(adj, 4, 5);
        System.out.println("添加边 (4,5) 后，图的邻接表表示:");
        for (int i = 0; i < V; i++) {
            System.out.println("顶点 " + i + ": " + adj.get(i));
        }
        System.out.println();

        System.out.println("再次查找从顶点 " + u2 + " 到顶点 " + v2 + " 的路径 (添加边 4-5 后):");
        List<Integer> path3 = findPath(V, adj, u2, v2);
        if (path3.isEmpty()) {
            System.out.println("未找到路径。");
        } else {
            System.out.println("找到路径: " + path3); // 期望: [3, 1, 0, 2, 5] 或 [3, 1, 4, 5] 等
        }
        System.out.println();
        int u4 = 0;
        int v4 = 6; // 顶点6仍然是孤立的（或未充分连接）
        System.out.println("查找从顶点 " + u4 + " 到顶点 " + v4 + " 的路径:");
        List<Integer> path4 = findPath(V, adj, u4, v4);
        if (path4.isEmpty()) {
            System.out.println("未找到路径。");
        } else {
            System.out.println("找到路径: " + path4);
        }
    }
}
