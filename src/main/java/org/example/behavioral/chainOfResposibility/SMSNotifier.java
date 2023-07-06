package org.example.behavioral.chainOfResposibility;

public class SMSNotifier extends Notifier {
    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("самое важное уведомление: " + message);
    }
}
