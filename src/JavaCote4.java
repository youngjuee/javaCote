import java.util.ArrayList;

public class JavaCote4 {


    public ArrayList<String> solution(String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for (String x: str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public ArrayList<String> solution2(String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for (String x: str) {
            char[] ch = x.toCharArray();
            int lt = 0;
            int rt = ch.length-1;
            while(lt < rt){
                char tmp = ch[lt];
                ch[lt] = ch[rt];
                ch[rt] = tmp;
                lt++;
                rt--;
            }
            String a = String.valueOf(ch);
            answer.add(a);
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] str = {"good","Time","Big"};

        JavaCote4 cote4 = new JavaCote4();
        for (String x : cote4.solution2(str)) {
            System.out.println(x);
        }
    }
}
