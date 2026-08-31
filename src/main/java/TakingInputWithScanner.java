import java.util.Scanner;

public class TakingInputWithScanner {
    public static void main(String[] args) {
        System.out.println("Enter number please");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(num);

    }
}
