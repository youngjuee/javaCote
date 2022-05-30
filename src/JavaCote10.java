import java.util.Arrays;

public class JavaCote10 {
    public String solution(String phone_number) {
        String answer = "";
        String sp = phone_number.substring(0, phone_number.length()-4);
        String lit = phone_number.substring(phone_number.length()-4);
        sp = "*".repeat(sp.length());
        answer = sp+lit;
        return answer;
    }


    public static void main(String[] args) {
        JavaCote10 javaCote10 = new JavaCote10();

        System.out.println(javaCote10.solution("01033334444"));
    }
}
