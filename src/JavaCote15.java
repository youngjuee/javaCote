import java.util.ArrayList;
import java.util.Arrays;

public class JavaCote15 {
    public ArrayList<Integer> solution(int[] arr, int[] arr2){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;

        while(p1 < arr.length && p2 < arr2.length){
            if(arr[p1] < arr2[p2]){
                answer.add(arr[p1++]);
            }else if(arr[p1] == arr2[p2]){
                answer.add(arr2[p2++]);
                p1++;
            }else{
                answer.add(arr2[p2++]);
            }
        }

        while(p1 < arr.length){answer.add(arr[p1++]);}
        while(p2 < arr2.length){answer.add(arr2[p2++]);}

        return answer;
    }

    public ArrayList<Integer> solution2(int[] arr, int[] arr2){
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        int p1 = 0, p2 = 0;

        while(p1 < arr.length && p2 < arr2.length){
            if(arr[p1] < arr2[p2]){
                p1++;
            }else if(arr[p1] == arr2[p2]){
                answer.add(arr2[p2++]);
                p1++;
            }else{
                p2++;
            }
        }

//        while(p1 < arr.length){answer.add(arr[p1++]);}
//        while(p2 < arr2.length){answer.add(arr2[p2++]);}

        return answer;
    }
    public static void main(String[] args) {
        JavaCote15 javaCote15 = new JavaCote15();

        // 두 배열 합치기
//        for(int x : javaCote15.solution(new int[]{1,3,5}, new int[]{2,3,6,7,9})){
//            System.out.println(x+" ");
//        }

        // 공통원소구하기
        for(int x : javaCote15.solution2(new int[]{1,3,9,5,2}, new int[]{3,2,5,7,8})){
            System.out.println(x+" ");
        }
    }
}
