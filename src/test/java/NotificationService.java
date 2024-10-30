abstract class Notification {
    public abstract void sendNotification(String message);

}

class EmailNotification extends Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Send Email: " + message);
    }
}

class SMSNotification extends Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Send SMS: " + message);
    }
}



public class NotificationService {
    public static void sendAlert(Notification notification, String message) {
        notification.sendNotification(message); // Calls the correct sendNotification method
    }

    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();

        sendAlert(email, "Sent by Email");
        sendAlert(sms, "Sent by Sms");

    }
}