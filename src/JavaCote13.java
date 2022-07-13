public class JavaCote13 {

    public String Solution(String str){
        str = str.replace("#","1");
        str = str.replace("*","0");
        int num = 0;
        String result = "";
        for(int i =1; i <= str.length(); i++){

            if( i % 7 == 0){
                result += (char) Integer.parseInt(str.substring(num,i),2);
                num = i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        JavaCote13 javaCote13 = new JavaCote13();
        System.out.println(javaCote13.Solution("#****###**#####**#####**##**"));

    }
}
