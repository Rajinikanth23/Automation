package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        
        Set s=new HashSet();

        s.add(123);
        s.add("rajesh");
        s.add(123);
        s.add("QA");
        s.add("QA");
        s.add(90000.0);
        s.add(90000.0);
        s.add(null);
        s.add(null);

        System.out.println(s);

        s.remove(null);
        s.remove(90000.0);

        System.out.println(s);

        ArrayList list = new ArrayList<>(s);
        System.out.println(list.get(2));

        for (Object object : s) {
            System.out.print(object+" ");
        }
        System.out.println();

        Iterator it=s.iterator();

        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
        System.out.println();

        System.out.println(s.isEmpty());
    }
}
