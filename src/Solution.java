import java.util.Arrays;

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
