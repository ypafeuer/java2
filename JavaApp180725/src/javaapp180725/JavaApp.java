
package javaapp180725;

public class JavaApp {
    private int x=0;
    private int y=0;
    public static void main(String[] args) {
        JavaApp app=new JavaApp();
        app.printthis(1, 2);
        app.printthat(3, 4);
    }
    public void printthis(int x, int y){
        x=x;y=y;
        System.out.println(""+x+y);
    }
    public void printthat(int x, int y){
        this.x=x;this.y=y;
        System.out.println(""+x+y);
    }
    
}
