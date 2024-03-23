package Collections;
import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;

public class ArraylistDemo {
    public static void main(String[] args) {
        List list=new ArrayList<>();

        list.add(123);
        list.add("rajesh");
        list.add("QA");
        list.add(8897953981L);
        list.add(90000.00);
        list.add(123);
        list.add(null);
        list.add(null);

        System.out.println(list);

        System.out.println(list.get(3));
        System.out.println(list.get(1));
        System.out.println(list.size());

        System.out.println(list.remove(4));
        System.out.println(list);

        list.add(4, 900000);
        list.remove(5);

        System.out.println(list);

        list.set(5, 100000);

        System.out.println(list);
        
        for(int i=0;i<list.size();i++)
            System.out.print(list.get(i)+" ");
        System.out.println();    
        
        for (Object object : list) 
            System.out.print(object+" "); 
        System.out.println();  

        Iterator it=list.iterator();

        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
        System.out.println();


        List list2=new ArrayList();

        list2.add(null);
        list2.add(123);
        list2.add("QA");

        System.out.println(list2);

        System.out.println(list.isEmpty());
        list.removeAll(list2);

        System.out.println(list);

        list.clear();

        System.out.println(list.isEmpty());

    }
}
