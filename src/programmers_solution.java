import java.util.*;

public class programmers_solution {

    // 2022 KAKAO BLIND RECRUITMENT
    // 신고 결과 받기
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, Integer> singo = new HashMap<String, Integer>();
        HashMap<String, Integer> singodang = new HashMap<String, Integer>();
        for (String i : id_list) {
            singodang.put(i, 0);
            singo.put(i, 0);
        }

        report = Arrays.stream(report).distinct().toArray(String[]::new);
        for (String i : report) {
            String[] name = i.split(" ");
            singodang.replace(name[1], singodang.get(name[1]) + 1);
        }

        for (String i : report) {
            String[] name = i.split(" ");
            if(singodang.get(name[1]) >= k) {
                singo.replace(name[0], singo.get(name[0]) + 1);
            }

        }
        for(int i = 0; i < id_list.length; i++) {
            answer[i] = singo.get(id_list[i]);
        }

        return answer;
    }

//  코딩테스트 연습
//  완전탐색
//  모의고사
    public static int[] solution2(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] counta = {0,0,0};
        List<Integer> answer = new ArrayList<Integer>();

        for(int i =0; i<answers.length; i++) {
            if(answers[i % answers.length] == a[i % a.length]) {
                counta[0]++;
            }
            if(answers[i % answers.length] == b[i % b.length]) {
                counta[1]++;
            }
            if(answers[i % answers.length] == c[i % c.length]) {
                counta[2]++;
            }
        }

        int max = Math.max(counta[0], Math.max(counta[1], counta[2]));
        int j = 0;
        for(int k = 0; k < counta.length; k++) {

            if(max == counta[k]) {
                answer.add(k+1);
                j++;
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

//    없는숫자더하기
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        for(int i = 0; i < 10; i++){
            if(Arrays.binarySearch(numbers, i) < 0){

                answer += i;
            }
        }

        return answer;
    }
    //        코딩테스트 연습
    //        탐욕법(Greedy)
    //        체육복
    public static int solution3(int n, int[] lost, int[] reserve) {

        Map<Integer, Integer> reserveMap = new HashMap<Integer, Integer>();
        Arrays.sort(lost);
        List<Integer> lostList = new ArrayList<Integer>();

        Arrays.sort(reserve);
        int answer = n-lost.length;

        for(int i = 0; i < reserve.length; i++) {
            reserveMap.put(reserve[i], 1);
        }
        for(int i = 0; i < lost.length; i++) {
            if(reserveMap.containsKey(lost[i])){
                reserveMap.remove(lost[i]);
                lost[i] = -1;
                answer++;
            }else {
                lostList.add(lost[i]);
            }
        }


        for(int i = 0; i < lost.length; i++) {
            if(lost[i] != -1) {
                if(reserveMap.containsKey(lost[i]-1)) {
                    if(reserveMap.get(lost[i]-1) > 0) {
                        reserveMap.replace(lost[i]-1, 0);
                        if(lostList.contains(lost[i]-1)) {
                            lostList.remove(lost[i]-1);
                        }
                        answer++;
                        continue;
                    }
                }
                if(reserveMap.containsKey(lost[i]+1)) {
                    if(reserveMap.get(lost[i]+1) > 0) {
                        reserveMap.replace(lost[i]+1, 0);
                        if(lostList.contains(lost[i]+1)) {
                            lostList.remove(lost[i]+1);
                        }
                        answer++;
                    }
                }
            }

        }
        return answer;
    }

//    # 2019 카카오 개발자 겨울 인턴십 > 크레인 인형뽑기 게임
    public static int solution4(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> putList = new LinkedList<Integer>();
        int mNum = 0;
        while(true) {
            for(int i = 0; i < board.length; i++) {
//        	for(int i = board.length-1; i > -1; i--) {
                if(board[i][moves[mNum]-1] != 0) {
                    putList.add(board[i][moves[mNum]-1]);
                    board[i][moves[mNum]-1] = 0;
//        			System.out.println("putList "+ putList);
                    if(putList.size() > 1) {
                        if(putList.get(putList.size()-2) == putList.get(putList.size()-1)) {
                            putList.remove(putList.size()-2);
                            putList.remove(putList.size()-1);
                            answer += 2;
                        }
                    }
                    break;
                }
            }
            if(mNum >= moves.length-1) {
                break;
            }
            mNum++;
        }


        return answer;
    }

//    월간 코드 챌린지 시즌2 > 약수의 개수와 덧셈
    public static int solution5(int left, int right) {
        int answer = 0;
        List<Integer> arrLeft = new ArrayList<>();
        for(int i = left; i <= right; i++){
            for(int j = 1; j <= i; j++){
                if(i % j ==0) {
                    arrLeft.add(i);
                }
            }
            if(arrLeft.size() % 2 == 0){
                answer += i;
            }else{
                answer -= i;
            }
            arrLeft.clear();
        }

        return answer;
    }

//  Summer/Winter Coding(~2018) > 예산
    public static int solution6(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);
        for(int i = 0; i <= d.length; i++){
            sum += d[i];
            answer++;
            if(sum > budget){
                answer--;
                break;
            }
        }
        return answer;
    }


    public static int[] solution7(int[] numbers) {
        ArrayList<Integer> dd = new ArrayList<Integer>();
        for(int i = 0; i< numbers.length-1; i++){
            for(int j = i+1; j< numbers.length; j++){
                if(!dd.contains(numbers[i] + numbers[j])){
                    dd.add( numbers[i] + numbers[j]);
                }
            }
        }
        int[] answer = new int[dd.size()];
        Collections.sort(dd);
        int i =0;
        for(int j : dd) {
            answer[i++] = j;
        }
        return answer;
    }

    //최소직사각형
    public static int solution8(int[][] sizes) {
        int answer = 0;
        int right = 0;
        int left = 0;
        for(int i = 0; i <sizes.length; i++){
            int max = Math.max(sizes[i][0], sizes[i][1]);
            int min = Math.min(sizes[i][0], sizes[i][1]);
            if(max > right){
                right = max;
            }

            if(min > left){
                left = min;
            }
        }
        answer = right * left;
        return answer;
    }


    public static boolean solution(String s) {
        boolean answer = true;

        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(')' == c){
                if(st.isEmpty()){
                    answer = false;
                    break;
                }
                st.pop();
            }else{
                st.push(c);
            }

        }

        if(!st.isEmpty()) answer = false;

        return answer;
    }


    /**
     * 월간 코드 챌린지 시즌1
     * 이진 변환 반복하기
     * 2022. 10. 11
     */
    public int[] solution221011(String s) {
        int[] answer = {0,0};


        //System.out.println();
        while(s.length() > 1){
            int len = s.length();
            s = s.replace("0", "");
            int ze = len - s.length();
            len -= ze;
            answer[1] += ze;
            s = "";
            answer[0]++;
            //System.out.println(len);
            while(len != 0){
                s = len%2+s;
                len = len / 2;
            }
            //System.out.println(s);
        }

        return answer;
    }



    public static void main(String[] args) {
//        for(int j : solution(new String[]{"con", "ryan"}, new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}, 2)) {
//            System.out.println(j);
//        }
//        System.out.println(solution5(13,17));
//
       // System.out.println(solution6(new int[]{1,3,2,5,4}, 9));

        System.out.println(solution7(new int[]{2,1,3,4,1}));
    }
}
