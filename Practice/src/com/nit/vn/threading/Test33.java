package com.nit.vn.threading;

class myThread extends Thread {
    @Override
    public void run() {
        int i=1;
        while(i<30000) {
            System.out.println("Good Morning: ");
            i++;
        }
    }
}
class wel extends Thread {
    @Override
    public void run() {
        int i=1;
        while(i<30000) {
            System.out.println("Welcome: ");
            i++;
        }
    }
}
public class Test33 {
    public static void main(String[] args) {
        myThread mt=new myThread();
        wel w=new wel();

        mt.start();
        w.start(); 
    }
}
