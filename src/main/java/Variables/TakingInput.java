package Variables;

import java.io.*;

public class TakingInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter number");

//        int num = System.in.read();
//
//        System.out.println(num-48);  it return ASCII value of input taken

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);

        String a = "7";
        String b = "6";

        String c = a+b;
        String d=c;

        for (int i = 0; i< c.length(); i++){
            d = d + c.charAt(i);
            System.out.println(d);
        }
        System.out.println(d);
    }
}
