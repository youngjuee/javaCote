public class JavaCote6 {

    public String solution(String str){
        String answer = "";

        for(int i = 0; i < str.length(); i++){
//            System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)) );
            if(i == str.indexOf(str.charAt(i))){
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        JavaCote6 javaCote6 = new JavaCote6();
        System.out.println(javaCote6.solution("ksekkset"));
    }
}
