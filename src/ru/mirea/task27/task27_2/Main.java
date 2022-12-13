package ru.mirea.task27.task27_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static HashMap<String, String> createMap() {
        HashMap <String, String> hm = new HashMap <String, String>();

        hm.put("Kerr", "Amanda");
        hm.put("Rios", "Michael");
        hm.put("Harrington", "Andrew");
        hm.put("Cooper", "Christine");
        hm.put("Baker", "Dorothy");
        hm.put("Sloan", "Wayne");
        hm.put("Barry", "Austin");
        hm.put("Moses", "Judy");
        hm.put("Howard", "Brittany");
        hm.put("Donovan", "Robert");

        return  hm;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        int count = 0;
        for (String s : map.values())
            if (s.equals(name))
                count += 1;
        return count;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        int count = 0;
        for (String s : map.keySet())
            if (s.equals(lastName))
                count += 1;
        return count;
    }

    public static void main(String[] args) {
        HashMap <String, String> hm = createMap ();
        System.out.println("Number of matches by name: " + getSameFirstNameCount (hm, "Robert" ));
        System.out.println("Number of matches by last name: " + getSameLastNameCount (hm, "Moses" ));
    }
}
