import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Solution {
    public int solution(int n, int mix, int k) {
        int answer = 0;
        // 6 3 3
        int[] card = new int[n];
        for(int i = 0; i < n; i++)
            card[i] = i+1;

        while((mix--) != 0) {
            int[] cardA = new int[n/2];
            int[] cardB = new int[n/2];
            for(int i = 0; i < n; i++) {
                if(i < n/2){

                    cardA[i] = card[i];
                }else{

                    cardB[i-n/2] = card[i];
                }
            }
            for(int i = 0; i < n; i++) {
                if(i % 2 == 0)
                    card[i] = cardA[i/2];
                else
                    card[i] = cardB[i/2];
            }
        }

        answer = card[k-1];

        return answer;
    }




    /*
    * 2022.09.28 DFS활용 단어변환
    * */

    static boolean[] checked;
    static int answer = 0;
    static int cnt = 9999;
    public void DFS(String begin, String target, String[] words){
        if( begin != target){
            for(int i = 0; i<words.length; i++){
                if(!checked[i]){
                    boolean boo = compareStr(begin, words[i]);
                    if(words[i] != target && boo) {
                        boolean fbool = compareStr(begin, target);
                        if(!fbool){
                            System.out.println(fbool);
                            checked[i] = true;
                            answer++;
                            DFS(words[i], target, words);
                        }
                    }
                }
            }
        }
        if(cnt > answer){
            cnt = answer;
        }

    }

    public boolean compareStr(String com1, String com2){
        //System.out.println(com1 + "    " + com2);
        int cnt = 0;
        for(int i = 0; i < com1.length(); i++){
            if(com1.charAt(i) != com2.charAt(i)){
                cnt++;
            }
        }
        if(cnt > 1){
            return false;
        }
        return true;
    }

    public int solution(String begin, String target, String[] words) {

        if(!Arrays.asList(words).contains(target)){
            return 0;
        }
        checked = new boolean[words.length];
        answer++;
        DFS(begin, target, words);
        return cnt;
    }


    /*
    * 20220929
    * 완전탐색 소수찾기
    * */


    public boolean isPrime(int prime){
        int sq = (int) Math.sqrt(prime);
        if(prime == 0 || prime == 1){
            return false;
        }

        for(int i = 2; i <= sq; i++){
            if(prime % i == 0){
                return false;

            }
        }

        return true;
    }

    static HashSet<Integer> num = new HashSet<>();
    public void recursive(String com, String others){
        if(com != ""){
            num.add(Integer.valueOf(com));
        }
        for(int i = 0; i < others.length(); i++){
            recursive(com+others.charAt(i), others.substring(0,i)+ others.substring(i+1));
        }

    }


    public int solution(String numbers) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        recursive("", numbers);
        for(int j : num){
            System.out.println(j);
            if(isPrime(j)){
                answer++;
            }
        }
        return answer;
    }



    // priorityQueue사용 우선순위탐색
    // 프로그래머스 더 맵게
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i = 0; i < scoville.length ; i++){
            heap.add(scoville[i]);
        }

        while(!heap.isEmpty()){
            if(heap.size() > 1){
                if(heap.peek() < K){
                    int sc = heap.poll() + (heap.poll() * 2);
                    heap.add(sc);
                    answer++;
                }else{
                    return answer;
                }
            }else{
                if(heap.peek() > K){
                    return 1;
                }else{
                    break;
                }
            }
        }

        answer = -1;
        return answer;
    }




    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 6;
        int mix = 3;
        int k = 3;
        int ret = sol.solution(n, mix, k);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소의 반환 값은 " + ret + " 입니다.");
    }
}
