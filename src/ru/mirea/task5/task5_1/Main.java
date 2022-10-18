package ru.mirea.task5.task5_1;

import javax.swing.*;
import java.awt.*;

public class Main {
    private static int madridScore = 0;
    private static int milanScore = 0;
    private static JLabel scoreLabel = new JLabel();
    private static JLabel lastScorerLabel = new JLabel();
    private static JLabel winnerLabel = new JLabel();
    public static void main(String[] args) {
        Main m = new Main();
        JFrame frame = new JFrame("Match Result");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        JPanel mainPanel = new JPanel();
        JPanel btnPanel = new JPanel();
        JPanel textPanel = new JPanel();

        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(Color.GRAY);
        btnPanel.setBackground(Color.GRAY);
        textPanel.setBackground(Color.GRAY);
        mainPanel.setPreferredSize(new Dimension(250, 100));
        frame.getContentPane().add(mainPanel);

        scoreLabel.setText("Result: 0 X 0");
        winnerLabel.setText("Winner: DRAW");
        lastScorerLabel.setText("Last Scorer: N/A");
        JButton madridBtn = new JButton("Real Madrid");
        madridBtn.addActionListener(e -> incScore(true));
        JButton milanBtn = new JButton("AC Milan");
        milanBtn.addActionListener(e -> incScore(false));

        btnPanel.add(milanBtn);
        btnPanel.add(madridBtn);
        textPanel.add(scoreLabel);
        textPanel.add(lastScorerLabel);
        textPanel.add(winnerLabel);

        mainPanel.setLayout(new BorderLayout());

        mainPanel.add(btnPanel, BorderLayout.NORTH);
        mainPanel.add(textPanel, BorderLayout.WEST);
        frame.pack();
        frame.setVisible(true);
    }

    public static void incScore(boolean isMadrid) {
        if (isMadrid) {
            madridScore++;
        }
        else {
            milanScore++;
        }
        String winner = (madridScore > milanScore) ? "Real Madrid" : milanScore == madridScore ? "DRAW" : "AC Milan";
        scoreLabel.setText(String.format("Result: %d X %d", milanScore, madridScore));
        lastScorerLabel.setText(String.format("Last Scorer: %s", isMadrid ? "Real Madrid" : "AC Milan"));
        winnerLabel.setText(String.format("Winner: %s", winner));
    }
}
