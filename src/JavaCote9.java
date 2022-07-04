public class JavaCote9 {


    public int solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
//            if(x >= 48 && x <= 57)
//                answer = answer * 10 + (x - 48);
            if(Character.isDigit(x)){
                answer += x;
            }

        }

        return Integer.parseInt(answer);
    }
    public static void main(String[] args) {
        JavaCote9 javaCote9 = new JavaCote9();
        System.out.println(javaCote9.solution("g0en2T0s8eSoft"));
    }
}
