package com.nit.vn.threading;

class sagar extends Thread {
  @Override
  public void run() {
      int i=1;
      while(true) {
        System.out.println("Thanks You: Aakash");

        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
  }
}
class sanket extends Thread {
  @Override
  public void run() {
      int i = 1;
      while(i<=30000) {
        System.out.println("Thank you: Sagar");
      }
  }
}
public class Test31 {
  public static void main(String[] args) {
    //System.out.println("hello aakash :");
    sagar sa=new sagar();
    sanket sk=new sanket();
    sk.start();

    try {
      sk.join();
    } catch (Exception e) {
      System.out.println(e);
    }

    sa.start();
  }
}