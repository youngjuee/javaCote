public class JavaCote9 {


    public int solution(String str){
        int answer = 0;
        for(char x : str.toCharArray()){
            if(x >= 48 && x <= 57){
                answer = answer * 10 + (x - 48);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        JavaCote9 javaCote9 = new JavaCote9();
        System.out.println(javaCote9.solution("g0en2T0s8eSoft"));
    }
}
