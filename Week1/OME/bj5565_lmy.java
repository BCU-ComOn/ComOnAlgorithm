import java.util.*;
import java.io.*;
public class bj5565_lmy {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < 9; i++) N -= Integer.parseInt(br.readLine());
        bw.write(String.valueOf(N));
                bw.flush();
    }   
}