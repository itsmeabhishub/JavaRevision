package CoolectionFQuestions;


import java.util.ArrayList;

public class ArrayListEvenQ {
    public static void main(String[] args) {
        ArrayList<Integer> obj1 = new ArrayList<>();
        obj1.add(10);
        obj1.add(25);
        obj1.add(30);
        obj1.add(45);
        obj1.add(50);
        obj1.add(65);
        obj1.add(70);
        for (int i : obj1){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
        for(int i = 0; i< obj1.size(); i++){
            if(obj1.get(i) % 2 == 0){
                System.out.println(obj1.get(i));
            }
        }
    }
}
