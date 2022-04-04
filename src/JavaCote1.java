package src;


public class JavaCote1 {

    public int solution(String str, char ch){
        int answer = 0;
        str = str.toUpperCase();
        ch = Character.toUpperCase(ch);
        System.out.println(str + ch);

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch){
                answer++;
            }
        }
        return answer;
    }

    // 향상된 for문 사용시
    public int solution2(String str, char ch){
        int answer = 0;
        str = str.toUpperCase();
        ch = Character.toUpperCase(ch);

        for (char x: str.toCharArray() ) {
            if(x == ch){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        JavaCote1 javaCote1 = new JavaCote1();
        char c = 'c';
        System.out.println(javaCote1.solution2("Computercooler",c));
    }
}
