package RevisionJ;

import java.lang.reflect.Array;

public class ArrayJ {
    public static void main(String[] args) {

        int t[] = {3,6,9,5};
        System.out.println(t[3]);
        int obj[] = new int[5];
        obj[0] = 8;
        obj[1] = 9;
        obj[2] = 45;
        obj[3] = 3;
        obj[4] = 46;



        for (int n : obj){
            System.out.println(n);
        }
    }
}
