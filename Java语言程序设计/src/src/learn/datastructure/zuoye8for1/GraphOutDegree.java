package learn.datastructure.zuoye8for1;

import java.util.ArrayList;
import java.util.List;

public class GraphOutDegree {
    public static int[] calculateOutDegrees(List<List<Integer>> linJie) {
        int num = linJie.size();
        int[] size = new int[num];
        for (int i = 0; i < num; i++)
            if (linJie.get(i) != null) size[i] = linJie.get(i).size();
            else size[i] = 0;
        return size;
    }

    public static void main(String[] args) {
        // 示例：创建一个有向图
        // 顶点数量
        int numVertices = 5;
        List<List<Integer>> linJie = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            linJie.add(new ArrayList<>());
        }

        // 添加边 (有向)
        // 0 -> 1
        linJie.get(0).add(1);
        // 0 -> 2
        linJie.get(0).add(2);
        // 1 -> 3
        linJie.get(1).add(3);
        // 2 -> 3
        linJie.get(2).add(3);
        // 2 -> 4
        linJie.get(2).add(4);
        // 3 -> 0 (形成环)
        linJie.get(3).add(0);
        // 顶点4没有出边

        // 计算出度
        int[] outDegrees = calculateOutDegrees(linJie);

        // 打印结果
        System.out.println("各个顶点的出度:");
        for (int i = 0; i < outDegrees.length; i++) {
            System.out.println("顶点 " + i + ": " + outDegrees[i]);
        }

        // 另一个例子：包含一个孤立顶点（假设顶点2）
        List<List<Integer>> adjList2 = new ArrayList<>(3);
        adjList2.add(new ArrayList<>()); // 顶点0
        adjList2.add(new ArrayList<>()); // 顶点1
        adjList2.add(new ArrayList<>()); // 顶点2

        adjList2.get(0).add(1);

        System.out.println("\n第二个图的各个顶点的出度:");
        int[] outDegrees2 = calculateOutDegrees(adjList2);
        for (int i = 0; i < outDegrees2.length; i++) {
            System.out.println("顶点 " + i + ": " + outDegrees2[i]);
        }
    }
}