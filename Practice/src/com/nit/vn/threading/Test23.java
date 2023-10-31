package com.nit.vn.threading;

class OddEvenPrinter {
	private boolean printed;
	
	public synchronized void add(int oddNum) {
		if(printed) {
			try {
				wait();
			} catch (InterruptedException e) {}
			
		}
		
		System.out.println(oddNum +  " ");
		printed = true;
		notify();
	}
	
	public synchronized void even(int evenNum) {
		if(printed) {
			try {
				wait();
			} catch (InterruptedException e) {}
			
		}
		
		System.out.println(evenNum + " ");
		printed = false;
		notify();
	}

	public void odd(int i) {
		// TODO Auto-generated method stub
		
	}
		
}

class OddRunnable implements Runnable {
	private OddEvenPrinter printer;
	
	public OddRunnable(OddEvenPrinter printer) {
		this.printer = printer;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=20;i=i+2) {
			printer.odd(i);
		}
	}
	
}

class EvenRunnable implements Runnable {
	private OddEvenPrinter printer;
	
	public EvenRunnable(OddEvenPrinter printer) {
		this.printer = printer;
	}
	
	@Override
	public void run() {
		for(int i=2;i<=20;i=i+2) {
			printer.even(i);
		}
		
	}
}
public class Test23 {
	public static void main(String[] args) {
		OddEvenPrinter printer = new OddEvenPrinter();
		new Thread(new OddRunnable(printer)).start();;
		new Thread(new EvenRunnable(printer)).start();;
		
	}
}