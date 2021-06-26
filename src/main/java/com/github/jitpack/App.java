package com.github.jitpack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        System.out.println(new App().greet("world"));
        System.out.println("This is to test the webhook trigger ");
    }

    public String greet(String name) {
        return "Hello " + name;
    }
}
