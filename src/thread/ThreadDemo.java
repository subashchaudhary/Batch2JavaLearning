package thread;

public class ThreadDemo {

    static void main() {


        //two way of defining thread class in java
        // 1. extending Thread class
        //2. Implementing Runnable interface

        System.out.println("My Application is running in main thread");


        for(int i=0;i<10;i++){
            System.out.println("Main Thread: " + i);
        }


//        OddThread oddThread = new OddThread();
//        EvenThread evenThread = new EvenThread();
//        oddThread.start();
//        evenThread.start();




        //creating object of runnable interface and passing it to thread class constructor
//        MyThread1 myThread1 = new MyThread1();
//        Thread thread = new Thread(myThread1); //creating thread object and passing runnable object to it
//        thread.start();


        System.out.println("Counter thread");

        IncrementThread counterThread1 = new IncrementThread();
        IncrementThread counterThread2 = new IncrementThread();
        counterThread1.start();
        counterThread2.start();


        System.out.println("Application stopped in main thread");

    }
}

//1. extending Thread class

class MyThread extends Thread{

    @Override
    public void run() {

        //code to be executed in thread
        System.out.println("Thread is running");
        for(int i=0;i<10;i++){
            try {
                MyThread.sleep(1000); //sleep for 1 second
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread is running: " + i);
        }
    }


}


class EvenThread extends Thread{


    @Override
    public void run() {

        for(int i=0;i<10;i++){

            try {
                Thread.sleep(1000); //sleep for 1 second
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(i%2==0){
                System.out.println("Even Thread: " + i);
            }
        }
    }
}

class OddThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(1000); //sleep for 1 second
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(i%2!=0){
                System.out.println("Odd Thread: " + i);
            }
        }
    }



}


//2. Implementing Runnable interface

class MyThread1 implements Runnable{

    @Override
    public void run() {

        System.out.println("Thread is running");
    }
}


//synchronization in java
//example:
//int counter = 0;
//Thread 1: counter++; 1,
//Thread 2: counter++; 2,
// when two or more threads access a shared resource (like a variable) at the same time, it can lead to inconsistent results.
//this problem can be solved by using synchronization, which ensures that only one thread can access the shared resource at a time.


class IncrementThread extends Thread{

    static int counter = 0;

    @Override
    public void run() {
        increment();
    }

    //synchronized method to increment counter
    synchronized void increment(){
        for(int i=0;i<10;i++){
            counter++;
        }
        System.out.println("Counter: " + counter);
    }
}
