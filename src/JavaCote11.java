import java.util.Arrays;

public class JavaCote11 {

    public int[] solution(String str, String target){
        int[] answer = new int[str.length()];
        int p = 1000;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == target.charAt(0)){
                p = 0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = p;
            }
        }

        for(int i = str.length()-1; i > -1; i--){
            if(str.charAt(i) == target.charAt(0)){
                p = 0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = Math.min(p,answer[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        JavaCote11 javaCote11 = new JavaCote11();
        System.out.println(Arrays.toString(javaCote11.solution("teachermode","e")));
    }
}
