public class JavaCote2 {
    public String solution(String str){
        String answer = "";
        for (char x: str.toCharArray()) {
            if(Character.isLowerCase(x)){
                answer += Character.toUpperCase(x);
            }else{
                answer += Character.toLowerCase(x);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        String str = "StuDY";

        JavaCote2 cote2 = new JavaCote2();
        System.out.println(cote2.solution(str));

    }
}
