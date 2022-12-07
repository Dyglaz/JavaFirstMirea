package ru.mirea.task21.Test;

public class MyGenericArrayList<E> {
    private int size;
    // количество элементов-емкость списка
    private Object[] elements;
    public MyGenericArrayList() { //конструктор
        elements = new Object[10];
// выделяем память сразу для 10 элементов списка при его создании
        size = 0;
    }
    public void add(E e) {
        if (size < elements.length) {
            elements[size] = e;
        } else {
// добавляем элемент к списку и увеличиваем счетчик количества элементов
        }
        ++size;
    }
    public E get(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        return (E)elements[index];
    }
    public int size() { return size; }
}
