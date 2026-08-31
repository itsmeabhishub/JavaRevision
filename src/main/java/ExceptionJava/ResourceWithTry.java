package ExceptionJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ResourceWithTry {
    public static void main(String[] args) throws IOException {
        int num;

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            num = Integer.parseInt(br.readLine());
            int t = 18/ num;
            System.out.println(t);
    }
    }
}
