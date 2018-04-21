/**
 * 
 */
package com.corejava.multithreading;

/**
 * @author Bhabadyuti Bal
 *
 */
public class MultiThreadingEx1 {
	
	
	public static void sendMail() {
		System.out.println("Sending Mail....");
		try {
			Thread.currentThread();
			Thread.sleep(2000);
			System.out.println("Mail sent !!!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		String threadName = Thread.currentThread().getName();
		System.out.println("threadName: "+threadName);
	}

}
