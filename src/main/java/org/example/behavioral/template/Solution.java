package org.example.behavioral.template;

public class Solution {
    public static void main(String[] args) {
        NewsPage newsPage = new NewsPage();
        WelcomePage welcomePage = new WelcomePage();
        newsPage.showPage();
        System.out.println("<<<>>>");
        welcomePage.showPage();
    }
}
