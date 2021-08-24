package com.polymorphism;

public class PercyJackson extends Book{
    public PercyJackson(int id, String title) {
        super(id, title);
    }

    @Override
    public String getShortPlot(){
        return "Percy Jackson Plot";
    }
}
