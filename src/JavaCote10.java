import javax.lang.model.type.ArrayType;
import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaCote10 {
    // 최대공약수와 최대공배수 구하기 (유클리드 호제법)
    public int[] solution2(int n, int m) {
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

    public int[] solution(int[] arr) {
        int[] answer;
        if(arr.length > 1){
            answer = new int[arr.length-1];
            int min = Arrays.stream(arr).min().getAsInt();
            int i = 0;
            for(int j = 0; j <arr.length; j++){
                if(arr[j] != min){
                    answer[i] = arr[j];
                    i++;
                }
            }

        }else{
            answer = new int[1];
            answer[0] = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        JavaCote10 javaCote10 = new JavaCote10();

        System.out.println(Arrays.toString(javaCote10.solution(new int[]{4,3,2,1})));
    }
}
