package org.example.behavioral.template;

public abstract class WebSiteTemplate {
    public void showPage(){
        System.out.println("header");
        showPageContent();
        System.out.println("footer");
    }
    public abstract void showPageContent();
}
