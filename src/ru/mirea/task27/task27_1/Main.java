package ru.mirea.task27.task27_1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main
{
    public static <T> Set<T> getInstance(Set<T> hashSet)
    {
        Set<T> treeSet = hashSet.stream().collect(Collectors.toCollection(TreeSet::new));
        return treeSet;
    }

    public static void main(String[] args)
    {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("First");
        hashSet.add("Second");
        hashSet.add("Third");

        Set<String> treeSet = getInstance(hashSet);
        System.out.println(treeSet);
    }
}
