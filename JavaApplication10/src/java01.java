
import java.util.ArrayList;
import java.util.Collections;


class name implements Comparable<name>{
    String first,last;

    public name(String first , String last ) {
        this.first=first;
        this.last=last;
    }
        
    public int compareTo(name n) {
        int cmplast = last.compareTo(n.last);
        return cmplast !=0 ? cmplast : first.compareTo(n.first);
    }
    public String toString(){
        return first+last;
    }
}

public class java01{
    public static void main (String[] args) {
        ArrayList<name> list = new ArrayList<name>();
        list.add(new name("Joe", "Shmoe"));
        list.add(new name("John", "Doe"));
        list.add(new name("Jane", "Doe"));
        System.out.println(list);
        Collections.sort(list);
        for(name n : list ){
            System.out.println(n);
        }
    }

}
