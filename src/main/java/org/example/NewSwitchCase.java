package org.example;

public class NewSwitchCase {
    public static void main(String[] args) {
        String days = "Saturday";

        String res = "";

//        switch (days){
//            case "Monday" -> System.out.println("Wakeup at 8 am");
//            case "Saturday","Sunday" -> System.out.println("Wakeup at 9 am");
//            default -> System.out.println("Wakeup at 7 am");
//        }

//        switch (days){
//            case "Monday" -> res="8am";
//            case "Saturday","Sunday" -> res="9am";
//            default -> res="7am";
//        }
        res = switch (days) {
            case "Monday"  ->  "8am";
            case "Saturday", "Sunday" ->  "9am";
            default ->  "7am";
        };

        System.out.print(res);
    }
}
