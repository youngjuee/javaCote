import java.util.Locale;

public class JavaCote8 {

    public String solution(String str){
        String answer = "No";
//        ^는 부정이므로 알파벳 대문자가 아니면 빈 문자화 시켜라
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(str).reverse().toString();
//        equalsIgnoreCase는 대소문자를 가리지않음
        if(str.equalsIgnoreCase(tmp)){
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args) {
        JavaCote8 javacote8 = new JavaCote8();
        System.out.println(javacote8.solution("found7, time: study; Yduts, emit; 7Dnuof"));
    }
}
