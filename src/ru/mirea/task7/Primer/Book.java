package ru.mirea.task7.Primer;

public class Book implements Printable{
    String name;
    String author;
    int year;

    Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }
    @Override
    public void print() {
        System.out.printf("Книга '%s' (автор %s) была издана в %d году \n", name, author, year);
    }
}
