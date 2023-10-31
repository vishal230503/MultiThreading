package com.nit.vn.threading;

class myThread extends Thread {
    @Override
    public void run() {
        System.out.println("Good Morining: Aakash");
    
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Test32 {
    public static void main(String[] args) {
        System.out.println("Hello Sanket");
        myThread mt=new myThread();
        mt.run();
        mt.start();
    }
}
