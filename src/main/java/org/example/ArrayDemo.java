package org.example;

public class ArrayDemo {
    public static void main(String[] args) {
        int arr[] = {1,2,3,6};
        System.out.println(arr[1]);

        int arr1[] = new int[4];
        arr1[0]=8;
        arr1[1]=15;
        arr1[2]=19;
        arr1[3]=25;

            for(int i =0; i<4; i++) {
                System.out.println(arr1[i]);
            }
    }
}
