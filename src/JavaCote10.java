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
    
    public long solution(long n) {
        long answer = 0;
        String st = Long.toString(n);
        char[] ch = st.toCharArray();


        for(int i=0; i<ch.length; i++){
            for(int j=0; j<ch.length; j++){
                if(ch[i] > ch[j]){
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        answer = Long.parseLong(String.valueOf(ch));

        return answer;
    }

    public static void main(String[] args) {
        JavaCote10 javaCote10 = new JavaCote10();

        System.out.println(javaCote10.solution(118372));
    }
}
