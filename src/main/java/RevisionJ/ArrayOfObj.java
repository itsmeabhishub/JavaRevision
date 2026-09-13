package RevisionJ;

class ArrOfObj{
    String name;
    int Salary;
    String Role;
}

public class ArrayOfObj {
    public static void main(String[] args) {
        ArrOfObj Dev1 = new ArrOfObj();
        Dev1.name = "Abhishek";
        Dev1.Salary= 30000;
        Dev1.Role= "Developer";

        ArrOfObj Dev2 = new ArrOfObj();
        Dev2.name = "Ankit";
        Dev2.Salary= 90000;
        Dev2.Role= "Developer";

        ArrOfObj Devep[] = new ArrOfObj[2];
        Devep[0] = Dev1;
        Devep[1] = Dev2;

        System.out.println(Devep.length);

        for (ArrOfObj nna : Devep){
            System.out.println(nna.name + " :  " + nna.Role);
        }
    }
}
