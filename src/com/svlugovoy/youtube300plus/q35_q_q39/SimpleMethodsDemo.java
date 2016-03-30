package com.svlugovoy.youtube300plus.q35_q_q39;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 30.03.2016.
 */
public class SimpleMethodsDemo {
    public static void main(String[] args) {

        System.out.println("Hello, world!!!");

        SimpleMethodsDemo obj = new SimpleMethodsDemo();
        obj.helloWorld();
        obj.helloWorldFrom("Alex");

        multiply(2, 2);
//        SimpleMethodsDemo.multiply(2, 2);
//        int result = multiply(2, 2);
//        System.out.println(result);

    }

    private void helloWorld() {
        System.out.println("Hello, world!!!");
    }

    private void helloWorldFrom(String str) {
        System.out.println("Hello, world!!! From " + str);
    }

    static int multiply(int x, int y) {
        return x*y;
    }
}
