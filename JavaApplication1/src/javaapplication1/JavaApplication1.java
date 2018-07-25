package javaapplication1;
    import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        System.out.println(1+2);
        System.out.println(""+1+2);
        System.out.println(""+(1+2));
        System.out.println("1+2");
        System.out.println("1"+"2");
        System.out.println(1+"+"+2);
        System.out.println((1+2)+3);
        int i1 = 1;
        int i2 = 2;
        System.out.println(i1+i2);
        System.out.println(i1+i2+"");
        int i3 = 1+2;
        System.out.println(i3);
        double d1 = 1.234;
        double d2 = 2.345;
        System.out.println(d1);
        System.out.println(10.0+d1+d2);
        long l1 = 5L;
        System.out.println(l1);
        System.out.println((int)'我'+(int)'愛'+(int)'你');
        
        Scanner sc = new Scanner(System.in);
        
        /*System.out.print("A: ");
        int A = sc.nextInt();
        System.out.print("B: ");
        int B = sc.nextInt();
        System.out.println("A + B = " + (A+B));*/
        
        /*System.out.print("底: ");
        int A = sc.nextInt();
        System.out.print("高: ");
        int B = sc.nextInt();
        System.out.println("面積: " + (A*B/2.0));*/
        
        String s;
        int score = -1;
        while(true){
            System.out.print("成績: ");
            s = sc.nextLine();
            try{
                score = Integer.parseInt(s);
                if(score >= 0 && score <= 100) break;
                else System.out.print("輸入錯誤, 請重新輸入");
            }catch(Exception e){
                System.out.print("輸入錯誤, 請重新輸入");
            }
        }
        /*if(score >= 60) System.out.println("合格");
        else System.out.println("當掉");*/
        switch(score/10){
            case 10:
            case 9:
            case 8:
            case 7:
            case 6:
                System.out.println("合格");
                break;
            default:
                System.out.println("當掉");
        }
                        
    }
    
}
