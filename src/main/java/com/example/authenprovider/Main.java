package com.example.authenprovider;

class B {
    public static void test() {
        System.out.println("Test");
    }
}

public class Main {
    public static void main(String[] args) {
        B b = null;
        B.test();
        b.wait();
    }
}
