package ExceptionJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyBlockJ {
    public static void main(String[] args) throws IOException {
        int num = 0;
        BufferedReader br = null;

        try {
            InputStreamReader in = new InputStreamReader(System.in);
             br = new BufferedReader(in);
            num = Integer.parseInt(br.readLine());
            int r = 18/num;
            System.out.println(r);
        } finally {
            br.close();
        }
    }
}
