package com.company;

public class Main {

    public static void main(String[] args) {

        //Compile Time Error: The constructor Singleton() is not visible
        //Singleton object = new Singleton();

        //Get the only object available
        Singleton object = Singleton.getInstance();

        //show the message
        object.showMessage();
    }
}
