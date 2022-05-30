import java.util.Arrays;

public class JavaCote10 {
    // 평균값 구하기
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        answer = sum / arr.length;
        return answer;
    }


    public static void main(String[] args) {
        JavaCote10 javaCote10 = new JavaCote10();

        System.out.println(javaCote10.solution(new int[]{1, 2, 3, 4}));
    }
}
