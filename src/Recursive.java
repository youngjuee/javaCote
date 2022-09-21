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


    static int[] fibo;
    public int fibonacci(int n){
        if(n == 1) return fibo[1] = 1;
        if(n == 2) return fibo[2] = 1;
        else return fibo[n] = fibonacci(n-2) + fibonacci(n-1);


    }



    public static void main(String[] args) {
        Recursive T = new Recursive();
        //T.DFS(11);
        //System.out.println(T.factorial(5));
        fibo = new int[10+1];
        T.fibonacci(10);
        System.out.println(fibo[10]);
    }
}