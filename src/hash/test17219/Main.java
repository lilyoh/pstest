package hash.test17219;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String count = br.readLine();
        StringTokenizer st = new StringTokenizer(count);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, String> inputs = new HashMap<>();

        // 사이트와 비밀번호 받기
        for(int i = 0; i < n; i++) {
            String input = br.readLine();
            StringTokenizer inputst = new StringTokenizer(input);
            String url = inputst.nextToken();
            String pw = inputst.nextToken();

            inputs.put(url, pw);
        }

        // 비번을 찾을 사이트 받기
        String[] inputToFind = new String[m];
        for(int i = 0; i < m; i++) {
            inputToFind[i] = br.readLine();
        }

        // inputs 에서 비밀번호 찾아 sb에 저장
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m; i++) {
            sb.append(inputs.get(inputToFind[i])).append("\n");
        }

        System.out.println(sb);

    }
}
