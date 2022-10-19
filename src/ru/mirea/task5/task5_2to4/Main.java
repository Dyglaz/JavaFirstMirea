package ru.mirea.task5.task5_2to4;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        JFrame frame = new JFrame("Draw Random");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        JLabel label = getLabelWithPic("D:\\BUZ\\semestr3\\Java\\gif\\Ldbc.gif");
        mainPanel.add(label);

        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setVisible(true);
    }

    private static JLabel getLabelWithPic(String path) throws IOException {
        Image im = ImageIO.read(new File(path));
        return new JLabel(new ImageIcon(im));
    }

    private static JPanel getPanelWithRandomShapes() {
        return new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (int i = 0; i < 20; i++) {
                    Shape s;
                    int ch = (int) (Math.random() * 2);
                    if (ch == 0) {
                        s = new Rect();
                        g.setColor(s.color);
                        g.fillRect(s.x, s.y, s.width, s.height);
                    }
                    else {
                        s = new Oval();
                        g.setColor(s.color);
                        g.fillOval(s.x, s.y, s.width, s.height);
                    }
                }

            }
        };
    }
}

abstract class Shape {
    int x;
    int y;
    int width;
    int height;
    Color color;

    protected static int random(int max) {
        return (int) (max * Math.random());
    }
}

class Rect extends Shape {
    public Rect() {
        x = random(300);
        y = random(300);
        width = random(100);
        height = random(100);
        color = new Color(random(255), random(255), random(255));
    }
}

class Oval extends Shape {
    public Oval() {
        x = random(300);
        y = random(300);
        width = random(50);
        height = random(50);
        color = new Color(random(255), random(255), random(255));
    }
}

