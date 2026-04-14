package Java_Polymorphism_Abstraction_Interfaces;

public class Task03EasyInstanceofBranching {

    interface Notification {
        void send();
    }

    static class EmailNotification implements Notification {
        @Override
        public void send() {
            System.out.println("Email sent.");
        }
    }

    static class SmsNotification implements Notification {
        @Override
        public void send() {
            System.out.println("SMS sent.");
        }
    }

    public static void main(String[] args) {
        Notification[] notifications = {
                new EmailNotification(),
                new SmsNotification(),
                new EmailNotification()
        };

        for (Notification n : notifications) {
            if (n instanceof EmailNotification) {
                System.out.print("[Email Channel]: ");
            } else if (n instanceof SmsNotification) {
                System.out.print("[SMS Channel]: ");
            }
            n.send();
        }
    }
}
