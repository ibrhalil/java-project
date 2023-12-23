package com.ibrhalil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapOrnek {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put("H", "Hidrojen");
        hm.put("Li", "Lityum");
        hm.put("Au", "Altin");
        hm.put("Ag", "Gumus");
        hm.put("U", "Uranyum");
        Set set = hm.entrySet();

        Iterator i = set.iterator();

        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.println(me.getKey() + " : " + me.getValue());
        }

        HashMap hMap = new HashMap(hm);

        System.out.println("Yeni  : " + hMap);
    }
}

