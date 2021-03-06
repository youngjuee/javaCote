import java.util.Arrays;

public class JavaCote10 {
    // 최대공약수와 최대공배수 구하기 (유클리드 호제법)
    public int[] solution2(int n, int m) {
        int[] answer = new int[2];
        int A = Integer.max(n,m);
        int B = Integer.min(n,m);
        int r = 1;
        // 최대공약수
        while(true){
            r = A%B;
            A = B;
            if(r < 1){
                answer[0] = B;
                break;
            }
            B = r;
        }
        // 최소공배수
        answer[1] = n*m / answer[0];
        return answer;
    }

    public long solution(long n) {
        long answer = 0;
        String st = Long.toString(n);
        char[] ch = st.toCharArray();


        for(int i=0; i<ch.length; i++){
            for(int j=0; j<ch.length; j++){
                if(ch[i] > ch[j]){
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        answer = Long.parseLong(String.valueOf(ch));

        return answer;
    }

    public long solution2(long num) {
        num++;
        long digit = 1;

        while (num / digit % 10 == 0) {
            num += digit;
            digit *= 10;
        }
        return num;
    }

    public int[] solution4(int[] arrA, int[] arrB) {
        int arrA_idx = 0, arrB_idx = 0;
        //4
        int arrA_len = arrA.length;
        //3
        int arrB_len = arrB.length;
        int answer[] = new int[arrA_len + arrB_len];
        int answer_idx = 0;
        while(arrA_idx < arrA_len && arrB_idx < arrB_len){
            if(arrA[arrA_idx] < arrB[arrB_idx])
                answer[answer_idx++] = arrA[arrA_idx++];
            else
                answer[answer_idx++] = arrB[arrB_idx++];
        }
        while(arrA_idx < arrA_len)
            answer[answer_idx++] = arrA[arrA_idx++];
        while(arrB_idx < arrB_len)
            answer[answer_idx++] = arrB[arrB_idx++];

        return answer;
    }

    public int[] solution5(int N, int[] votes) {
        int vote_counter[] = new int[11];
        for (int i = 0; i < votes.length; ++i) {
            vote_counter[votes[i]] += 1;
        }
        int max_val = 0;
        int cnt = 0;
        for (int i = 1; i <= N; ++i) {
            if (max_val < vote_counter[i]) {
                max_val = vote_counter[i];
                cnt = 1;
            }
            else if(max_val == vote_counter[i]){
                cnt += 1;
            }
        }
        int answer[] = new int[cnt];
        for (int i = 1, idx = 0; i <= N; ++i){
            if (vote_counter[i] == max_val) {
                answer[idx] = i;
                idx += 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        JavaCote10 javaCote10 = new JavaCote10();
        //System.out.println(javaCote10.solution2(118372));
//        long num = 9949999;
//        long ret = javaCote10.solution2(num);

        //System.out.println(javaCote10.solution4(new int[]{-2, 3, 5, 9}, new int[]{0, 1, 5}));

        System.out.println(Arrays.toString(javaCote10.solution5(5, new int[]{1,5,4,3,2,5,2,5,5,4})));


    }
}
