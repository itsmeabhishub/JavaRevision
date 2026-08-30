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
    }
}
