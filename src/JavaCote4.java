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

    public static void main(String[] args) {
        String[] str = {"good","Time","Big"};

        JavaCote4 cote4 = new JavaCote4();
        for (String x : cote4.solution(str)) {
            System.out.println(x);
        }
    }
}
