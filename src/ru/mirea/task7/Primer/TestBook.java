package ru.mirea.task7.Primer;

public class TestBook {
    public static void main(String [] args) {
        Book b1 = new Book("Война и мир", "Л. Н. Толстой", 1863);
        b1.print();
        Printable printable = new Book("Война и мир", "Л. Н. Толстой", 1863);
        printable.print();
        printable = new Journal("Хакер");
        printable.print();

        printable = createPrintable("Компьютерра",false);
        printable.print();
        read(new Book("Отцы и дети", "И. Тургенев", 1862));
        read(new Journal("Хакер"));
    }
    static void read(Printable p){
        p.print();
    }

    static Printable createPrintable(String name, boolean option){
        if(option)
            return new Book(name, "неизвестен", 2015);
        else
            return new Journal(name);
    }
}
