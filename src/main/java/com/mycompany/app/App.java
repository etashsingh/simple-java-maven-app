package com.mycompany.app;

/**
 * Hello world!
 * HELLO!
 */
public class App
{

    private final String message = "Hello World!";
    private final String message2 = "OKAY OKAY";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
        System.out.println(new App().getMessage2());
    }

    private final String getMessage() {
        return message;
    }
    private final String getMessage2() { return message2; }

}
