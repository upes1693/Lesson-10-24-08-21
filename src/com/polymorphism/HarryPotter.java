package com.polymorphism;

public class HarryPotter extends Book {

    public HarryPotter(int id, String title) {
        super(id, title);
    }

    @Override
    public String getShortPlot(){
        return "Harry Potter Plot";
    }

    public void method(){

    }
}
