package ru.mirea.task18.task18_1;

// Шаг 1: Так как возникла исключительная ситуация (деление на ноль)
// программа бросила исключение и завершила свою работу.
//exception.exceptionDemo();

// Шаг 2: При делении на 0.0 результат будет математически неопределенным .
// Согласно стандарту IEEE 754, который использует Java,
// при делении на ноль требуется возвращать специальное значение infinity.
//exception.exceptionDemo2();

// Шаг 3: При использовании блока try-catch программа не завершает свою работу,
// но оповещает пользователя о возникшем исключении тем способом, который задал программист.

public class Exception1 {
    public void exceptionDemo() {
        System.out.println( 2 / 0 );
    }

    public void exceptionDemo2() {
        System.out.println( 2.0 / 0.0 );
    }

    public void exceptionDemoTry() {
        try
        {
            System.out.println(2 / 0);
        }  catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        Exception1 exception = new Exception1();
        exception.exceptionDemoTry();
    }
}
