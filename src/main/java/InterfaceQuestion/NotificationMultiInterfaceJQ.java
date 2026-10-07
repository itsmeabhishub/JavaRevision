package InterfaceQuestion;

import java.util.Arrays;
import java.util.List;

interface NotificationMulti{
    void send(String message);
}

class EmailNotificationMulti implements NotificationMulti{
    public void send(String message){
        System.out.println(message + " to Email notification");
    }
}

class SMSNotificationMulti implements NotificationMulti{
    public void send(String message){
        System.out.println(message + " to SMS notification");
    }
}

class WhatsAppNotificationMulti implements NotificationMulti{
    public void send(String message){
        System.out.println(message + " to Whatsapp notification");
    }
}

public class NotificationMultiInterfaceJQ {
    public static void main(String[] args) {
        List<NotificationMulti> notify = Arrays.asList(
                new EmailNotificationMulti(),
                new SMSNotificationMulti(),
                new WhatsAppNotificationMulti()
        );
        for (NotificationMulti n : notify){
            n.send("Welcome");
        }
    }
}
