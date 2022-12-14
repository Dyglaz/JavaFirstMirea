package ru.mirea.task26;

import java.util.Hashtable;

public class hashtab {
    Hashtable hashTable;

    public void hashtabInit(int capacity, float loadFactor ) {
        hashTable = new Hashtable(capacity, loadFactor);
    }

    public void hashtabHash() {
        if (hashTable == null)
            return;
        System.out.println(hashTable.hashCode());
    }

    public <K> void hashtabLookup(K key) {
        if (hashTable == null)
            return;

        if (hashTable.containsKey(key)) {
            System.out.println("The value of " + key + " is " + hashTable.get(key));
        }
        else {
            System.out.println("There's no " + key + " in table");
        }
    }

    public <K, V> void hashtabAdd(K key, V value) {
        if (hashTable == null)
            return;
        hashTable.put(key, value);
    }

    public <K> void hashtabDelete(K key) {
        if (hashTable == null)
            return;
        hashTable.remove(key);
    }
}
