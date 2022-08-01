import java.util.Arrays;
import java.util.HashMap;

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


    public static void main(String[] args) {
        for(int j : solution(new String[]{"con", "ryan"}, new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}, 2)) {

            System.out.println(j);
        }
    }
}
