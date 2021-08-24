package com.polymorphism;

public class Main {

    public static void main(String[] args) {
        //Polymorphism means "many forms", and it occurs when we have many classes that
        //are related to each other by inheritance.

        //Inheritance lets us inherit attributes and methods from another class.
        //Polymorphism uses those methods to perform different tasks.
        //This allows us to perform a single action in different ways.
        //For example animal base class that has makeSound method and others classes implement it.

        //What is polymorphism in programming?
        //Polymorphism in programming is defined usage of a single symbol
        // to represent multiple different types.

        //We already discussed that method overloading is compile polymorphism and method overriding
        //is a runtime polymorphism

        //What is Polymorphism variables?
        //A polymorphic variable is defined as a variable that can hold
        // values of different types during the course of execution.

        //Why use Polymorphism in Java?
        //Polymorphism in Java makes it possible to write a method that
        //can correctly process lots of different types of functionalities
        //that have the same name. We can also gain consistency in our code by using polymorphism.

        //Advantages of Polymorphism in Java
        //It provides reusability to the code.
        //The classes that are written, tested and implemented can be reused multiple times.
        //This, in turn, saves a lot of time for the coder.
        //Also, the code can be changed without affecting the original code.
        //A single variable can be used to store multiple data values.
        //The value of a variable inherited from the superclass into the subclass can be
        //changed without changing that variable’s value in the superclass or any other subclasses.
        //With lesser lines of code, it becomes easier for the programmer to debug the code.

        Book book = new Book(1, "Book");
        HarryPotter harryPotter = new HarryPotter(2, "Harry Potter");
        LordOfTheRings lordOfTheRings = new LordOfTheRings(3, "Lord Of the Rings");
        PercyJackson percyJackson = new PercyJackson(4, "Percy Jackson");
        BookWithNoPlot bookWithNoPlot = new BookWithNoPlot(5, "Book with no plot");

        Library library = new Library("Tel Aviv Library", "Hamasger 100 Tlv",
                new Book[]{book, harryPotter, lordOfTheRings, percyJackson, bookWithNoPlot});

        Book randomBook = library.borrowRandomBook();
        Book randomBook2 = library.borrowRandomBook();
        Book randomBook3 = library.borrowRandomBook();
        Book randomBook4 = library.borrowRandomBook();
        Book randomBook5 = library.borrowRandomBook();
        Book randomBook6 = library.borrowRandomBook();
        Book randomBook7 = library.borrowRandomBook();
        Book randomBook8 = library.borrowRandomBook();

        //We can see that java will check each time what type is the object randomBook that was
        //returned from the method borrowRandomBook, it's looking at this object and checking if it's
        //got a getShortPlot method , if not it will go to the father method
        System.out.println("Title " + randomBook.getTitle() + " \nPlot: " + randomBook.getShortPlot());
        System.out.println("Title " + randomBook2.getTitle() + " \nPlot: " + randomBook2.getShortPlot());
        System.out.println("Title " + randomBook3.getTitle() + " \nPlot: " + randomBook3.getShortPlot());
        System.out.println("Title " + randomBook4.getTitle() + " \nPlot: " + randomBook4.getShortPlot());
        System.out.println("Title " + randomBook5.getTitle() + " \nPlot: " + randomBook5.getShortPlot());
        System.out.println("Title " + randomBook6.getTitle() + " \nPlot: " + randomBook6.getShortPlot());
        System.out.println("Title " + randomBook7.getTitle() + " \nPlot: " + randomBook7.getShortPlot());
        System.out.println("Title " + randomBook8.getTitle() + " \nPlot: " + randomBook8.getShortPlot());

        //We can cast between objects that inheriting each other:
        //Casting from a subclass to a superclass is called upcasting.
        //Typically, the upcasting is implicitly performed by the compiler.
        Book bookHarryPotter = new HarryPotter(1010, "Harry Potter 2");
        System.out.println(bookHarryPotter.getShortPlot());
        //bookHarryPotter.method();
        PercyJackson percyJackson1=new PercyJackson(444,"Percy");
        Book bookPercy=percyJackson1;
        //Here comes the downcasting. It’s the casting from a superclass to a subclass.
        PercyJackson percyJackson2=(PercyJackson) bookPercy;
        Object o=new Book(4,"ds");

        //The java instanceof operator is used to test whether the object
        //is an instance of the specified type (class or subclass or interface).
        //The instanceof in java is also known as type comparison operator
        //because it compares the instance with type. It returns either true or false.
        //If we apply the instanceof operator with any variable that has null value,
        //it returns false.

        boolean bool= bookPercy instanceof PercyJackson;
        System.out.println(bool);
        boolean bool2= bookPercy instanceof Book;
        System.out.println(bool2);
        boolean bool3= bookPercy instanceof HarryPotter;
        System.out.println(bool3);
    }
}
