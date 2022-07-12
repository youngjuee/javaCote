public class JavaCote12 {
    public String solution(String req){
        StringBuffer sb = new StringBuffer();
        int num = 1;
        for(int i = 0; i < req.length()-1; i++){
            if(req.charAt(i) != req.charAt(i+1)){
                sb.append(req.charAt(i));
                if(num > 1){
                    sb.append(Integer.toString(num));
                    num = 1;
                }
            }else{
                num++;
            }
        }
        sb.append(req.charAt(req.length()-1));
        return sb.toString();
    }

    public static void main(String[] args) {
        JavaCote12 javaCote12 = new JavaCote12();
        System.out.println(javaCote12.solution("KKHSSSSSE"));
    }
}
