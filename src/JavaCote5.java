import java.util.ArrayList;

public class JavaCote5 {

    public String solution(String str){
        String answer = "";
        char[] ch = str.toCharArray();
        int lt = 0;
        int rt = ch.length -1;


        while(lt < rt){
            // 특수문자일때
            if(!Character.isAlphabetic(ch[lt])) lt++;
            else if(!Character.isAlphabetic(ch[rt])) rt--;
            else{
                char temp = ch[lt];
                ch[lt] = ch[rt];
                ch[rt] = temp;
                lt++;
                rt--;
            }
        }

        // 스트링화 시켜줌
        answer = String.valueOf(ch);
         return answer;
    }


    public static void main(String[] args) {
        JavaCote5 javaCote5 = new JavaCote5();

        String str = "a#b!GE*T@S";
        System.out.println(javaCote5.solution(str));
    }
}
