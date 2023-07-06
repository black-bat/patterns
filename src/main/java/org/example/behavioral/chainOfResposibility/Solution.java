package org.example.behavioral.chainOfResposibility;

public class Solution {
    public static void main(String[] args) {
        Notifier simpleNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.VERY_IMPORTANT);

        simpleNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        simpleNotifier.notifyManager("все ок", Priority.ROUTINE);
        System.out.println("<<<>>>");
        simpleNotifier.notifyManager("внимание, что-то не так", Priority.IMPORTANT);
        System.out.println("<<<>>>");
        simpleNotifier.notifyManager("уже поздно что-то делать", Priority.VERY_IMPORTANT);
    }
}
