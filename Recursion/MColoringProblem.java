import java.util.*;
public class MColoringProblem {
    public static boolean isSafe(int node, List<Integer>[] G, int[] color, int n, int col){
        for(int adj : G[node]){
            if(color[adj]==col) return false;
        }
        return true;
    }
    public static boolean solve(int node, List<Integer>[] G, int[] color, int n, int m){
        if(node == n) return true;
        for(int i=1; i<=m; i++){
            if(isSafe(node, G, color, n, i)){
                color[node] = i;
                if(solve(node+1, G, color, n, m)== true) return true;
                color[node] = 0;
            }
        }
        return false;
    }
    public static boolean graphColoring(List<Integer>[] G, int[] color, int i, int m){
        int n = G.length;
        if(solve(i, G, color, n,m)== true) return true;
        return false; 
    }
    public static void main(String[] args){
        int n = 4;
        int m = 3;

        List<Integer>[] G = new ArrayList[n];
        for(int i=0; i<n; i++){
            G[i] = new ArrayList<>();
        }
        G[0].add(1);
        G[1].add(0);

        G[0].add(2);
        G[2].add(0);

        G[1].add(2);
        G[2].add(1);

        G[1].add(3);
        G[3].add(1);

        int[] color = new int[n];

        if(graphColoring(G, color, 0,m)){
            System.out.println("coloring is possible");
            for(int i=0; i<n; i++){
                System.out.println("vertex "+i+" -> color "+color[i]);
            }
        }else{
            System.out.println("Coloring is not possible");
        }

    }
}
