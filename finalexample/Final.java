package com.finalexample;
//final variable is a constant variable that can be initialized only when we declare it
//or within the constructor, it's value is constant and can't be changed after initialization
//final variables are instance variables meaning each instance will have its own copy
//unlike static variable
//we can use final and static together in case it's constant shared value between all instances
//Naming convention- final variables will be named with only capital letters and _ between words
//for example SOME_VALUE

//final methods can't be overridden
//final classes can't be extended

public class Final {
    private static final double PI;

    static {
        PI=3.14;
    }

    public Final(){
        //PI=3.14;
    }

    public static void main(String[] args){
       // this.pi=5;

        Teacher t=new Teacher();
        t.doSomething();
    }
}
