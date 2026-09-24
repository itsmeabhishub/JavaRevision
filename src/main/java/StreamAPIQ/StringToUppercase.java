package StreamAPIQ;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StringToUppercase {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("abhishek", "ankit", "manas", "abhay");
         str.stream()
                .map(String::toUpperCase)
                 .forEach(n -> System.out.println(n));
    }
}
