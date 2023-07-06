package org.example.behavioral.chainOfResposibility;

public class SimpleReportNotifier extends Notifier {
    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("уведомление обычное: " + message);
    }
}
