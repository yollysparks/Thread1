/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread1;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author felesiah
 */
public class Thread1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
       Count ct = new Count();
        
		Runnable r = () -> {
			for (long i = 0; i < 1000000000; i++) { 
                            ct.count();
			}
                    };
                Runnable r2 = () -> {
			for (long i = 0; i <= 5; i++) {  
                            ct.increment();
			}
		};
                Runnable r3 = () -> {
			for (long i = 0; i >= 10; i++) {  
                            ct.increment();
			}
		};

		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
               
		

		t1.start();
                 System.out.println(ct.get());
		t2.start();
                TimeUnit.SECONDS.sleep(2);
                 System.out.println(ct.getSum());
		t3.start();
                TimeUnit.SECONDS.sleep(3);
                  System.out.println(ct.get());
                  
		t1.join();
		t2.join();
		t3.join();

		
        
	}
    }
    

