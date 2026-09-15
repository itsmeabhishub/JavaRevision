package CoolectionFQuestions;

import java.util.ArrayList;

public class ArrayListDuplicateJ {
    public static void main(String[] args) {
        ArrayList<Integer> obj2 = new ArrayList<>();
        obj2.add(10);
        obj2.add(10);
        obj2.add(10);
        obj2.add(20);
        obj2.add(10);
        obj2.add(40);
        obj2.add(50);
        obj2.add(30);

        for(int i = 0; i<obj2.size(); i++){
            for (int j = i+1; j< obj2.size(); j++){
                if(obj2.get(i) == obj2.get(j)){
                    obj2.remove(j);
                    j--;
                }
            }
        }
        for (int t : obj2){
            System.out.println(t);
        }
    }
}
