package com.company;

public class Egg extends Thread {
    public void run(){
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100); // Для наглядности, приостановим поток на короткое время
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Яйцо");
        }
    }
}
