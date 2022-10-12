package ru.mirea.task2.task2_9;

import java.util.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        List<String> deck = generateDeck();
        Collections.shuffle(deck);
        int n;
        System.out.println("Введите числов игроков (не больше 10): ");
        n = new Scanner(System.in).nextInt();
        if (n > 10) {
            System.out.println("Слишком много игроков!");
            System.exit(0);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Игрок " + (i + 1) + ": " + String.join(" ", deck.subList(5*i, 5*i + 5)));
        }
    }

    private static List<String> generateDeck() {
        String[] suits = {"S", "H", "D", "C"};
        String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        List<String> deck = new ArrayList<String>();
        for (String suit : suits) {
            for (String value : values) {
                deck.add(value + suit);
            }
        }
        return deck;
    }
}
