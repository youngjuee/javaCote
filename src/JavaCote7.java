import java.util.Locale;

public class JavaCote7 {

    public String solution(String str){
        String answer = "YES";
        int len = str.length();
        str = str.toLowerCase();
        for(int i = 0; i < len; i++){
            if(str.charAt(i) != str.charAt(len - i - 1)){
                return "NO";
            }

        }

        return answer;
    }

    public String solution2(String str){
        String answer = "YES";
        String tmp = new StringBuilder(str).reverse().toString();
        if(!str.equalsIgnoreCase(tmp)){
            return "No";
        }
        System.out.println(tmp);
        return answer;
    }
    public static void main(String[] args) {

        JavaCote7 javaCote7 = new JavaCote7();

        System.out.println(javaCote7.solution2("gooG"));
    }
}
