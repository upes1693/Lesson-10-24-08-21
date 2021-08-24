package com.polymorphism;

public class LordOfTheRings extends Book {
    public LordOfTheRings(int id, String title) {
        super(id, title);
    }

    public String getShortPlot(){
        return "Lord Of The Rings plot";
    }
}
