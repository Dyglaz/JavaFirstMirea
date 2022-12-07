package ru.mirea.task22.task22_1;

import java.util.*;

public class RPNCalculator {
    private static Stack<Integer> stack = new Stack<Integer>();
    private static Scanner input = new Scanner(System.in);
    private  static  int intStackValue;

    public static void main(String[] args) {
        try {
            calculator();
        } catch (Exception e) {
            System.out.println("Incorrect value set algorithm, try again");
        }
    }

    public static String calculator() throws Exception {
        System.out.println("Polish Calculator");
        takeInput();
        return null;
    }

    private static void takeInput() {
        String stackValue = "";
        while (!stackValue.equals("exit")) {
            System.out.println("Enter value: ");
            stackValue = input.next();
            try {
                intStackValue = Integer.valueOf(stackValue);
                stack.push(intStackValue);
            } catch (Exception e) {
                if (stackValue.equals("*")) {
                    stack.push(stack.pop() * stack.pop());

                } else if (stackValue.equals("/")) {
                    stack.push(stack.pop() / stack.pop());

                } else if (stackValue.equals("+")) {
                    stack.push(stack.pop() + stack.pop());

                } else if (stackValue.equals("-")) {
                    stack.push(stack.pop() - stack.pop());

                } else if (stackValue.equals("=")) {
                    System.out.println(stack.pop());

                } else if (stackValue.equals("c")) {
                    if (!stack.empty()) {
                        for (int i = 0; i < stack.size(); i++) {
                            stack.pop();
                        }
                    }
                } else if (stackValue.equals("w")) {
                    for (int i = 0; i < stack.size(); i++) {
                        System.out.println(stack.get(i));
                    }
                }
            }
        }
    }
}
