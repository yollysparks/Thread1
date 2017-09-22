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
public class Count {
    private long i = 0;
    private long sum = 0;
	public long get() {
		return i;
	}

	public void set(int i) {
		this.i = i;
	}
	public void increment() {
		this.i++;
	}

     public long getSum() {
        return sum;
    }
        
        public void count(){
         for (int i = 1; i <= 1000000000; i++) {       
           sum += i;
         }
     }          
    
}
