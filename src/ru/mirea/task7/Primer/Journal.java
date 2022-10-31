package ru.mirea.task7.Primer;

public class Journal implements Printable {
    private String name;

    public String getName() {
        return name;
    }

    public Journal(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.printf("Журнал '%s'\n", name);
    }
}
