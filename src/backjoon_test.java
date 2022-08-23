import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class backjoon_test {

    static int N;
    static boolean[] check = new boolean[101];

    static int count = 0;
    public static void dfs(int start){
        check[start] = true;
        count++;
        for(int i = 1; i < N; i++){
            if(virus[i][start] == 1 && !check[i])
                dfs(i);
        }
    }

    static int[][] virus = new int[101][101];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        for(int i = 0; i <M ; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            virus[u][v] = virus[v][u]= 1;
        }
        dfs(1);

        System.out.println(count-1);
    }
}
