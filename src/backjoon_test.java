import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class backjoon_test {

//    static int N;
//    static boolean[] check ;
//    static int[][] virus;
//    static int count = 0;
//    public static void dfs(int start){
//        check[start] = true;
//
//        for(int i = 1; i <= N; i++){
//            if(virus[start][i] == 1 && !check[i]){
//                count++;
//                dfs(i);
//            }
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        N = Integer.parseInt(st.nextToken());
//        st = new StringTokenizer(br.readLine());
//        int M = Integer.parseInt(st.nextToken());
//        check = new boolean[101];
//        virus = new int[101][101];
//        for(int i = 0; i <M ; i++){
//            st = new StringTokenizer(br.readLine());
//            int u = Integer.parseInt(st.nextToken());
//            int v = Integer.parseInt(st.nextToken());
//            virus[u][v] = virus[v][u] = 1;
//        }
//        dfs(1);
//
//        System.out.println(count);
//    }

    static int N;
    static int[][] aptdangi;
    static int cnt = 0;
    private static int dx[] = {0,0,-1,1};
    private static int dy[] = {-1,1,0,0};
    private static boolean[][] check;
    private static ArrayList<Integer> list = new ArrayList<>();
    public static void dfs(){
        for(int i = 1 ; i <= N ; i++){
            for(int j = 1 ; j <= N ; j++){
                if(aptdangi[i][j] == 1 && !check[i][j]){
                    cnt++;
                    search(i, j);
                    list.add(cnt);
                    cnt = 0;
                }
            }
        }
    }

    public static void search(int i, int j){
        check[i][j] = true;
        for(int k = 0 ; k < 4 ; k++){
            int di = i + dx[k];
            int dj = j + dy[k];
            if(di >= 0 && dj >= 0 && di <= N && dj <= N){
                if(!check[di][dj] && aptdangi[di][dj] == 1){
                    check[di][dj] = true;
                    search(di, dj);
                    cnt++;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        aptdangi = new int[N+1][N+1];
        check = new boolean[N+1][N+1];
        for(int i = 1; i <= N; i++){
            String[] ss = br.readLine().split("");
            for(int j = 1; j <= N; j++){
                aptdangi[i][j] = Integer.parseInt(ss[j-1]);
            }
        }
        dfs();
        Collections.sort(list);
        System.out.println(list.size());
        for(int i : list){
            System.out.println(i);
        }

    }
}
