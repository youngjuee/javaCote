import java.util.Arrays;

public class JavaCote10 {
    // 하샤드수
    public boolean solution(int x) {
        boolean answer = true;
        String st = Integer.toString(x);
        char[] ch = st.toCharArray();
        int sum = 0;
        for(int i=0; i< ch.length; i++){
            sum += Integer.parseInt(String.valueOf(ch[i]));
        }
        if(x % sum != 0) answer = false;
        return answer;
    }


    public static void main(String[] args) {
        JavaCote10 javaCote10 = new JavaCote10();

        System.out.println(javaCote10.solution(144));
    }
}
