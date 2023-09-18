package com.company;

public class Egg extends Thread {
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Яйцо");
        }
    }
}
