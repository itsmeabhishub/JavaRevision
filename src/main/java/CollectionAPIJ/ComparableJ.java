package CollectionAPIJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StudentC implements Comparable<StudentC>{
    int age;
    String name;

    public StudentC(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return "Studenr name is " + name +" and age is " +age+" ";
    }

    public int compareTo(StudentC that){
        if(this.age> that.age)
            return 1;
        else
            return -1;
    }


}

public class ComparableJ {
    public static void main(String[] args) {

        List<StudentC> studC = new ArrayList<>();
        studC.add(new StudentC(26,"Abhishek"));
        studC.add(new StudentC(24,"Abhay"));
        studC.add(new StudentC(25,"Manas"));
        studC.add(new StudentC(26,"Ankit"));

        Collections.sort(studC);

        for (StudentC std: studC){
            System.out.println(std);
        }
    }
}
