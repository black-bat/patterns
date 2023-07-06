package org.example.behavioral.visitor;

import org.example.creational.singlton.A;

public class Solution {
    public static void main(String[] args) {
        ArtSchool artSchool = new ArtSchool();
        Artist artist1 = new BadArtist();
        Artist artist2 = new GoodArtist();
        artSchool.createPicture(artist1);
        System.out.println("<<<>>>");
        artSchool.createPicture(artist2);
    }
}
