
import java.util.Scanner;

public class JavaCote3 {
    public String useSplitSolution(String str){
        String answer = "";
        int maxNum = Integer.MIN_VALUE;
        String [] s = str.split(" ");
        for(String st : s){
            int len = st.length();
            if(len > maxNum){
                answer = st;
            }
        }

        return answer;
    }

    public String useIndexOf(String str){
        String answer = "";
        int maxNum = Integer.MIN_VALUE, pos;
        while((pos = str.indexOf(' ')) !=  -1){
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len > maxNum){
                answer = tmp;
            }
            str = str.substring(pos+1);

            if(str.length() > maxNum) answer = str;
        }

        return answer;
    }

    public static void main(String[] args) {
        JavaCote3 J = new JavaCote3();
        Scanner sc = new Scanner(System.in);
        //String str = sc.nextLine();
        //System.out.println(J.solution(str));
        System.out.println(J.useIndexOf("It is time to study"));

    }
}
