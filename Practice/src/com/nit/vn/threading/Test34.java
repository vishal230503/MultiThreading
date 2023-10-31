package com.nit.vn.threading;

class myThread extends Thread {
    public myThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println("I am a Thread: ");
    }
}
public class Test34 {
    public static void main(String[] args) {
        System.out.println("Hello Aakash: ");
        myThread mt=new myThread("Aakash");
        mt.start();
        System.out.println("The Id of the thread is: "+mt.getId());
        System.out.println("The Name of the thread is: "+mt.getName());
    }
}
