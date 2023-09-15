package com.company;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {

        Chicken chicken = new Chicken();
        Egg egg = new Egg();

        chicken.start();
        egg.start();

        try {
            chicken.join();
            egg.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Спор окончен");
    }
}

