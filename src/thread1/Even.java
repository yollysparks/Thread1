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
public class Even {
 private int n = 0;
 
  public synchronized int next()
  {
    n++;
    n++;
    return n;
  }

    public int getN() {
        return n;
    }

   
}
