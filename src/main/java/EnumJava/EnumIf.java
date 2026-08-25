package EnumJava;

enum StatusDev{
    Running1, Failed1, Pending1, Success1;
}

public class EnumIf {
    public static void main(String[] args) {

        StatusDev x = StatusDev.Pending1;

        if(x == StatusDev.Running1){
            System.out.println("All Good");
        }
        else if (x == StatusDev.Failed1){
            System.out.println("Try Again");
        } else if (x == StatusDev.Pending1) {
            System.out.println("Loading Wait...");
        }
        else{
            System.out.println("Running..");
        }
    }
}
