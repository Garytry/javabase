package map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,String> hashMap = new HashMap<String, String>();
        //hashMap.put(null,null);
        System.out.println(hashMap.get(null));

        for (int i = 0; i < 10; i++) {
            hashMap.put(i+"gfd",String.valueOf(i));
        }
        long start = System.currentTimeMillis();
        for (Map.Entry<String,String> entry:hashMap.entrySet()){
            System.out.println(entry.getKey().hashCode());
            //System.out.println(entry.getValue());
        }
        long end = System.currentTimeMillis();
        //System.out.println(end-start);
    }
}
