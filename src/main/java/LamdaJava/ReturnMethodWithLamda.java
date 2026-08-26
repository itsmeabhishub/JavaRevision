package LamdaJava;

interface Returnadd{
    int add(int i, int j);
}

public class ReturnMethodWithLamda {
    public static void main(String[] args) {
        Returnadd obj1 = (i,j) -> i+j;

        int value = obj1.add(8,7);

        System.out.println(value);
    }
}
