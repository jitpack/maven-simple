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
        System.out.println("Hello, we are testing in the branches");
        System.out.println(" Are we getting the trigger with this branch and builds");
    }

    public String greet(String name) {
        return "Hello " + name;
    }
}
