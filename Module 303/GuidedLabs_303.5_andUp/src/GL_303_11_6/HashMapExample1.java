package GL_303_11_6;

import java.util.HashMap;

public class HashMapExample1 {
    public static void main(String[] args) {
        HashMap<Integer, String> languages = new HashMap<>();
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "Javascript");
        languages.put(4, "C#");


        System.out.println("HashMap (printed): " + languages);
        System.out.println("HashMap (entry.Set()): " + languages.entrySet());
        System.out.println("HashMap (keyset): " + languages.keySet());
        System.out.println("HashMap (values): " + languages.values());

        String v2 = languages.remove(2);
        System.out.println("removed value: " + v2);
        System.out.println("Updated HashMap: " + languages.entrySet());

        System.out.println("***EXAMPLE TWO***");
        HashMap<String, String> hm = new HashMap<>();
        hm.put("key1", "Lenovo");
        hm.put("key2", "Motorola");
        hm.put("key3", "Nokia");
        hm.put("Key4", null);
        hm.put(null, "Sony");
        System.out.println("Original map: " + hm.entrySet());
        System.out.println("Size of original map: " + hm.size());

        HashMap <String, String> copyhm = new HashMap<>();
        copyhm.putAll(hm);
        System.out.println("Copy of HashMap: " + copyhm.entrySet());

        String nullKeyValue = copyhm.remove(null);
        System.out.println("CopyHashMap null key value: " + nullKeyValue);
        System.out.println("CopyHashMap after removing null value: " + copyhm.entrySet());
        System.out.println("Size of CopyHashMap: " + copyhm.size());





    }
}
