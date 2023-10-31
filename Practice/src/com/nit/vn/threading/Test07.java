package com.nit.vn.threading;

class PrintNumbers {
	static void print() {
		for(int i=1;i<=20;i++) {
			System.out.print(i + " ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			
		}
	}
}
public class Test07 {
	public static void main(String[] args) {
		PrintNumbers.print();
	}
}
