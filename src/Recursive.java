public class Recursive {
    public void DFS(int n){
        if(n == 0){
        }else{
            DFS(n/2);
            System.out.print(n%2);
        }



    }

    public int factorial(int n){
        if(n == 1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Recursive T = new Recursive();
        //T.DFS(11);
        System.out.println(T.factorial(5));
    }
}