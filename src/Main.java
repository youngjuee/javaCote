import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class Main{
    static int N;
    //static int[][] graph;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int cnt = 0;
    public static void dfs(int v, int n){
        visited[v] = true;
        if(n >= 4) {
            System.out.println(1);
            System.exit(0);
        }
        for(int i = 0; i < graph[v].size(); i++) {
            int temp = graph[v].get(i);
            if(!visited[temp]) {
                visited[temp] = true;
                //System.out.println(temp);
                dfs(temp, n+1);
                visited[temp] = false;
            }
        }
    }

//      [1]
//      [0, 2]
//      [1, 3]
//      [2, 4]

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 사람의 수 5
        int M = Integer.parseInt(st.nextToken()); // 친구의 수 4
        graph = new ArrayList[N];
        visited = new boolean[N];
        for(int i =0; i < N; i++){
            graph[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            //System.out.println(" u  : "+ u + " v : "+ v);
            graph[u].add(v);
            graph[v].add(u);
        }
        for(int i =0; i < M; i++){
            //System.out.println(graph[i]);
            dfs(i, 0);
            visited = new boolean[N];
        }
        System.out.println(0);

    }
}