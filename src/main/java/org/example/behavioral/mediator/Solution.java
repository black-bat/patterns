package org.example.behavioral.mediator;

public class Solution {
    public static void main(String[] args) {
        SimpleChat chat = new SimpleChat();
        User admin = new Admin(chat, "admin");
        User user1 = new SimpleUser(chat, "user1");
        User user2 = new SimpleUser(chat, "user2");
        chat.setAdmin(admin);
        chat.addUser(user1);
        chat.addUser(user2);
        user1.sendMessage("Hello! I am 1.");
        user2.sendMessage("Hello! I am 2.");
        admin.sendMessage("Hello! I am admin.");
    }
}
