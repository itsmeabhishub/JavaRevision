package RevisionJ;

class Encap{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

public class EncapsulationInJava {
    public static void main(String[] args) {
        Encap obj12 = new Encap();

        obj12.setAge(12);
        obj12.setName("Abhishek");

        System.out.println(obj12.getName() +" and his age is "+ obj12.getAge());
    }
}
