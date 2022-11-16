//2. Разработайте программу выбора меню как на рис. 15.8 ниже.
//        Вам понадобится JComboBox.
//        При выборе пункта меню должна выводится информация о стране

package ru.mirea.task15.task15_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        new Menu();
    }
}

class Menu extends JFrame {
    static final String[] countries = {"Australia", "China", "England", "Russia"};
    static final String[] countriesInfo = {
            "Australia's capital is Canberra. Country's population is about 26 millions people.\nAustralia's island state Tasmania has the cleanest air in the world.",
            "China's capital is Beijing. Country's population is about 1.4 billion people.\nChina is the most populated country in the world.",
            "England's capital is London. Country's population is about 63,7 millions people.\nEngland fought the shortest fight in history.",
            "Russia's capital is Moscow. Country's population is about 146 millions people.\nRussia is the biggest country in the world."};
    JComboBox<String> comboBox = new JComboBox<>(countries);

    Menu() {
        super("Menu");
        setLayout(new FlowLayout());
        setSize(250, 150);
        add(comboBox);
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, countriesInfo[comboBox.getSelectedIndex()], "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
