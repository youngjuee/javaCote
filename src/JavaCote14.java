import java.util.ArrayList;

public class JavaCote14 {

    public ArrayList<Integer>  solution(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        for(int j = 1; j<arr.length; j++){
            if(arr[j] > arr[j-1]){
                result.add(arr[j]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        JavaCote14 javaCote14 = new JavaCote14();
        System.out.println(javaCote14.solution( new int[]{7, 3, 9, 5, 6, 12}));
    }
}
