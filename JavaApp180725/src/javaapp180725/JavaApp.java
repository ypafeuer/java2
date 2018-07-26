
package javaapp180725;
import javaapp180725.pp.*;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Date;
public class JavaApp {
   
    public static void main(String[] args) {
        WorkerThread th1 = new WorkerThread();    th1.id=10;
        WorkerThread th2 = new WorkerThread();    th2.id=20;
        Thread t1 = new Thread(th1);
        Thread t2 = new Thread(th2);
        t1.start();t2.start();//1
    }  
}
    class workpool{
    static ArrayList<Integer> list = new ArrayList<>();//2
    static int cc=1;
        public static void additem(int x) {  //3
            
            list.add(cc++); //4    
            System.out.println("th id="+x);
            System.out.println("size="+list.size());
            System.out.println(""+list.get( list.size()-1 ));
        }
    }
    class WorkerThread implements Runnable{
        public int id;
        //static Object bar = new Object();
        public void run(){ //5
            for(int i=0;i<5000;i++){
                workpool.additem(this.id);//6
            }
        }
    }
    
            

        //javaapp180725.pp.www  aa =new javaapp180725.pp.www();
        /*
        www aa =new www(){
            int x =10;
            public int xx(){
                    System.out.println("xx");
                    return 1;
            };
        };
        //aa.x=11;
        System.out.println(aa.xx());
        
        */
        /*
        Date date = new Date(); 
        Locale locale = new Locale("US");
        DateFormat df;
        df= DateFormat.getDateInstance(DateFormat.LONG, Locale.UK);
        
        System.out.println(df.format(date)); 
        
        */
        /*
        Thread t1 =new Thread(){
            public void run(){
                    System.out.println("ss");
            }
        };
        Thread t2= new Thread(t1);
        t2.run();
        
        */
        
        


