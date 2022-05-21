public class Main {
    public static void main(String[] args) {

        // First method is creating new threads witch class MyThread

        MyThread threadFirst = new MyThread(); // create first Thread
        threadFirst.start(); // start first Thread

        MyThread threadSecond = new MyThread(); // create second Thread
        threadSecond.start(); // start second Thread

        // Second method is creating new thread with class Runner

        Thread threadThird = new Thread(new Runner());
        threadThird.start();

    }
}

// First variant is creating class who extends class Thread and override method run()
class MyThread extends Thread {
    // Override run() from class Thread
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(100); // use sleep() to get slow Thread
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from MyThread " + i + ", Thread ID = " + Thread.currentThread().getId());
        }
    }
}

// Second variant is implements interface Runnable and override method run()

class Runner implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000); // use sleep() to get slow Thread
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from MyThread " + i + ", Thread ID = " + Thread.currentThread().getId());
        }
    }
}