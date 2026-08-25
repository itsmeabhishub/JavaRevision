package EnumJava;

import org.example.SwitchCase;

enum StatusCheck {
    Running, Pending, Failed, Success;
}

public class EnumSwitch {
    public static void main(String[] args) {

        StatusCheck m = StatusCheck.Success;

        switch (m) {
            case Running:
                System.out.println("All good");
                break;

            case Failed:
                System.out.println("Try Again");
                break;

            default:
                System.out.println("Loading...");
                break;

            case Success:
                System.out.println("Done Thanks...");
                break;
        }
    }
}
