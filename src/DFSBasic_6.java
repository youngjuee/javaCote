public class DFSBasic_6 {
    // 6. 부분집합 구하기 (DFS)
    static int n;
    static int[] ch;
    public void DFS(int start){
        if(start == n+1){
            for(int i = 0; i <= n ; i++){
                if(ch[i] == 1){
                    System.out.print(i + " ");
                }

            }
            System.out.println();
        }else{
            // 1을 쓴다고 가정
            ch[start] = 1;
            DFS(start + 1);
            // 1을 안 쓴다고 가정
            ch[start] = 0;
            DFS(start + 1);
        }
    }

    public static void main(String[] args) {
        DFSBasic_6 T = new DFSBasic_6();
        n = 3;
        ch = new int[n+1];
        T.DFS(1);
    }
}
