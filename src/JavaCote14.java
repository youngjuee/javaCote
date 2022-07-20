import java.util.ArrayList;
import java.util.Arrays;

public class JavaCote14 {

    public ArrayList<Integer> solution(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        for(int j = 1; j<arr.length; j++){
            if(arr[j] > arr[j-1]){
                result.add(arr[j]);
            }
        }
        return result;
    }

    public int solution2(int[] arr){
        int maxNum = arr[0];
        int result = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > maxNum){
                maxNum = arr[i];
                result++;
            }
        }
        return result;
    }

    public String[] solution3(int[] arr, int[] arr2){
        String[] result = new String[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > arr2[i] && arr[i]-arr2[i] == 1){
                result[i] = "A";
            }else if(arr[i] == arr2[i]){
                result[i] = "D";
            }else{
                result[i] = "B";
            }
        }
        return result;
    }

    public int[] solution4(int num){
        int[] result = new int[num];
        result[0] = 1;
        result[1] = 1;

        for(int i = 2; i < num; i++){
            result[i] = result[i-1]+result[i-2];
        }
        return result;
    }
    public static void main(String[] args) {
        JavaCote14 javaCote14 = new JavaCote14();
        // Array(1, 2차원 배열) 1. 큰수 출력하기
        //System.out.println(javaCote14.solution( new int[]{7, 3, 9, 5, 6, 12}));

        // Array(1, 2차원 배열) 2. 보이는 학생
//        System.out.println(javaCote14.solution2(new int[]{130, 135, 148, 140, 145, 150, 150, 153}));

        // Array(1, 2차원 배열) 3. 가위바위보
//        System.out.println(Arrays.toString(javaCote14.solution3(new int[]{2,3,3,1,3,}, new int[]{1,1,2,2,3})));

        // Array(1, 2차원 배열) 4. 피보나치 수열
        System.out.println(Arrays.toString(javaCote14.solution4(10)));
    }
}
