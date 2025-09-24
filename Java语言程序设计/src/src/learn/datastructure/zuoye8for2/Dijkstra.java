package learn.datastructure.zuoye8for2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dijkstra {
    public static List<Integer> findPath(int[][] graph, int source, int dest) {
        int length = graph.length;
        int[] dist = new int[length];
        boolean[] visited = new boolean[length];
        int[] prev = new int[length];
        for (int i = 0; i < length; i++) {
            dist[i] = 9999;
            prev[i] = -1;
            visited[i] = false;
        }
        dist[source] = 0;
        for (int count = 0; count < length; count++) {
            int u = -1;
            int minDistance = 9999;
            for (int i = 0; i < length; i++)
                if (!visited[i] && dist[i] < minDistance) {
                    minDistance = dist[i];
                    u = i;
                }
            if (u == -1) break;
            if (u == dest) break;
            visited[u] = true;
            for (int v = 0; v < length; v++)
                if (!visited[v] && graph[u][v] > 0 && dist[u] != 9999 &&
                        dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                    prev[v] = u;
                }
        }if (dist[dest] == 9999) return null;
        List<Integer> path = new ArrayList<>();
        int current = dest;
        while (current != -1) {
            path.add(current);
            current = prev[current];
        }Collections.reverse(path);
        return path;
    }
}
