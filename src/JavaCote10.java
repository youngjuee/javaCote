import java.util.ArrayList;
import java.util.Arrays;

public class JavaCote10 {
    // 최대공약수와 최대공배수 구하기 (유클리드 호제법)
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int A = Integer.max(n,m);
        int B = Integer.min(n,m);
        int r = 1;
        // 최대공약수
        while(true){
            r = A%B;
            A = B;
            if(r < 1){
                answer[0] = B;
                break;
            }
            B = r;
        }
        // 최소공배수
        answer[1] = n*m / answer[0];
        return answer;
    }

    public String solution2(int num) {
        String answer = "Odd";
        num = Math.abs(num);
        if(num % 2== 0 && num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE){
            answer = "Even";
        }

        return answer;
    }

    public static void main(String[] args) {
        JavaCote10 javaCote10 = new JavaCote10();

        System.out.println(javaCote10.solution2(-1));
    }
}
