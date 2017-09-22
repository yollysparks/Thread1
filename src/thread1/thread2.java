/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread1;


/**
 *
 * @author felesiah
 */
public class thread2 {
    public static void main(String[] args) throws InterruptedException {
       Even even = new Even();
        
		Runnable r1 = () -> {
			for (int n = 0; n <1000; n++) {
			 even.next();
			}
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
	
		t1.start();
                System.out.println(even.getN());
		t2.start();
	         System.out.println(even.getN());
              
	}
     }
//The Even.next() method is synchronized on the instance,
//because the next method is an instance method, and marked as 
//synchronized. Therefore only one of the threads can call the next() method at a time. 
//The other thread will wait until the first thread leaves the next() method, 
//before it can execute the method itself.
