package com.nit.vn.threading;

class PrintNumber {
	void print1to50 {
		
		for(int i=1;i<=50;i++) {
			System.out.println(i + "\t");
		
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	void print50to1 {
		for(int i=50;i<=1;i++) {
			System.out.println(i + "\t");
		}
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class Test09 {
	public static void main(String[] args) {
		PrintNumbers pn = new PrintNumbers();
		
		long time1 = System.currentTimeMillis();
		pn.print1to50();
		
		System.out.println();
		
		pn.print50to1();
		
		long time2 = System.currentTimeMillis();
		System.out.println("Time taken to complete both tasks: " + ((time2-time1)/1000) + "secs");
	}
}
