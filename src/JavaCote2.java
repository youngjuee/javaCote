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

    public String solution2(String str){
        String answer = "";
        for (char x: str.toCharArray()) {
            // 대문자면 소문자를 나타내고
            if(x >= 65 && x <= 90){
                answer += (char) (x += 32);
            }else{
                // x >= 97 && x <= 122
                // 소문자면 대문자로 나타내라
                answer += (char) (x -= 32);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        String str = "StuDY";

        JavaCote2 cote2 = new JavaCote2();
        System.out.println(cote2.solution2(str));

    }
}
