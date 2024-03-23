package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        
        Map hm=new HashMap();

        hm.put(1, "123");
        hm.put("job", "QA");
        hm.put("rajesh", "tester");
        hm.put(1, 20000);
        hm.put("sal:", 900000);
        hm.put("Admin", "manager");

        System.out.println(hm);

        hm.remove("Admin");

        System.out.println(hm);

        System.out.println(hm.get("job"));

        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.entrySet());

        for(Object k:hm.keySet())
            System.out.print(hm.get(k)+" ");
        System.out.println();
    }
}
