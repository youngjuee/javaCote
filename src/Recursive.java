public class Recursive {
    public void DFS(int n){
        if(n > 0){
            DFS(n-1);
            System.out.println(n);
        }

    }


    public static void main(String[] args) {
        Recursive T = new Recursive();
        T.DFS(3);

    }
}
