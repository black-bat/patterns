package org.example.behavioral.chainOfResposibility;

public class EmailNotifier extends Notifier {
    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("более важное уведомление: " + message);
    }
}
