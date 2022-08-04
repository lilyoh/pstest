////////// BufferedReader + charAt()

package test11021;

import java.io.*;
import java.util.StringTokenizer;

public class Main4 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
//        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= T; i++) {
            String str = br.readLine();
            sb.append("Case #").append(i).append(": ").append(str.charAt(0)-'0' + str.charAt(2)-'0').append("\n");
        }

        System.out.println(sb);
    }
}
