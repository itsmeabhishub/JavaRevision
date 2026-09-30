package InterfaceQuestion;

interface Notification {
    void send(String message);
}

class EmailNotification implements Notification {
    String personEmail;

    public EmailNotification(String email) {
        this.personEmail = email;
    }

    public void send(String message) {
        System.out.println(message + personEmail);
    }
}

class SmsNotification implements Notification {
    int personalNumber;

    public SmsNotification(int phoneNuber) {
        this.personalNumber = phoneNuber;
    }

    public void send(String message) {
        System.out.println(message + personalNumber);
    }
}

class WhatAppNotification implements Notification {
    String id;

    public WhatAppNotification(String whatsAppId) {
        this.id = whatsAppId;
    }

    public void send(String message) {
        System.out.println(message + id);
    }
}

public class NotificationInterfaceJQ {
    public static void main(String[] args) {
        Notification notify;
        notify = new EmailNotification("abhishek@gmail.com");
        notify.send("Hello welcome please verify your phone number ");

        notify = new SmsNotification(8877);
        notify.send("Hey welcome please verify your phone number ");

        notify = new WhatAppNotification("abhi");
        notify.send(" Hello welcome please verify your whatsapp id ");
    }
}
