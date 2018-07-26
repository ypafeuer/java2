package javaapplication10;

import java.util.concurrent.atomic.AtomicInteger;
public class Java01{
	 public final static AtomicInteger atomicInteger = new AtomicInteger(1);  
		public static void main(String[] args) throws InterruptedException {
			 final Thread []threads = new Thread[10];  
	         for(int i = 0 ; i < 10 ; i++) {  
	             final int num = i;  
	             threads[i] = new Thread() {  
	                 public void run() {  
	                     try {  
	                        Thread.sleep(1000);  
	                    } catch (InterruptedException e) {  
	                        e.printStackTrace();  
	                    }  
	                    int now = atomicInteger.incrementAndGet();  
	                    System.out.println("線程：" + num + "，值：" + now);  
	                 }  
	             };  
	             threads[i].start();  
	         }  
	         for(Thread t : threads) {  
	             t.join();  
	         }  
	         System.out.println("結果：" + atomicInteger.get()); 
		}
}