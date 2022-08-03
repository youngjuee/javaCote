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

    public static void main(String[] args) {
        for(int j : solution(new String[]{"con", "ryan"}, new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}, 2)) {
            System.out.println(j);
        }

    }
}
