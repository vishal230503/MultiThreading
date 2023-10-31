package com.nit.vn.threading;

class Add {
	int x,y;
	
	void add(int x,int y) {
		this.x = x; this.y = y;
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int res = this.x + this.y;
		
		System.out.println("In " + Thread.currentThread().getName()+" Result: " + res);
	}
}

class Thread1 extends Thread {
	Add a;
	Thread1(Add a) {
		this.a = a;
	}
	
	@Override
	public void run() {
		a.add(50,60);
	}
}

class Thread2 extends Thread {
	Add a;
	Thread2(Add a) {
		this.a = a;
	}
	
	@Override
	public void run() {
		a.add(70,80);
	}
}
public class Test08 {
	public static void main(String[] args) {
		Add a = new Add();
		
		new Thread1(a).start();
		new Thread2(a).start();
	}
}
