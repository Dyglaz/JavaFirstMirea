package ru.mirea.task26;

public class TestHashtab {
    public static void main(String[] args) {
        hashtab hashTable = new hashtab();
        hashTable.hashtabInit(10, 0.75f);

        hashTable.hashtabAdd("Anna", 12);
        hashTable.hashtabAdd("Andrew", 14);
        hashTable.hashtabAdd(15, "Olya");
        hashTable.hashtabAdd("Kirill", 31);
        hashTable.hashtabAdd("Maxim", 4);
        hashTable.hashtabAdd("Marie", "Rosa");
        hashTable.hashtabAdd(1125, 24);
        hashTable.hashtabAdd("Nick", "Angel");
        hashTable.hashtabAdd(0.005, 12f);
        hashTable.hashtabAdd('1', "One");

        hashTable.hashtabLookup(15);
        hashTable.hashtabDelete(15);
        hashTable.hashtabLookup(15);

        hashTable.hashtabLookup("New");
        hashTable.hashtabAdd("New", "World");
        hashTable.hashtabLookup("New");
    }
}
