package com.nit.vn.threading;

import java.io.BufferedInputStream;
import java.io.DataInputStream;

class MyThread17 extends Thread {
	@Override
	public void run() {
		System.out.println("Enter any value");
		System.out.println("run execute");
		System.out.println("run end");
	}
}
public class Test27 {
	public static void main(String[] args) throws Exception {
		DataInputStream x = new DataInputStream(System.in);
		
		System.out.println("Main start");
		
		int a = Integer.parseInt(x.readLine());
		int b = Integer.parseInt(x.readLine());
		int c  = a + b;
		System.out.println("Addition: " + c);
		
		MyThread17 mt = new MyThread17();
		mt.start();
		
		System.out.println("Main end");
		
	}
}
