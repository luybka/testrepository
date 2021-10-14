package com.itland.davydovskikh.itjava;

import java.awt.*;

import javax.swing.*;

class SolutionFlag extends JFrame {

    public SolutionFlag() {
        setBounds(0, 0, 300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SolutionFlag();
        JPanel window = new JPanel();
        FlowLayout fl = new FlowLayout();

        window.setLayout(fl);

        JButton button = new JButton("Razmer");
        JTextField dlina = new JTextField(10);
        JTextField shirina = new JTextField(10);

        window.add(button);
        window.add(dlina);
        window.add(shirina);

        JFrame frame = new JFrame("New");

        frame.setContentPane(window);
        frame.setSize(400, 100);
        frame.setVisible(true);

        new SolutionFlag();
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.BLACK);
        g.fillRect(40, 40, 200, 40);

        g.setColor(Color.RED);
        g.fillRect(40, 80, 200, 40);

        g.setColor(Color.YELLOW);
        g.fillRect(40, 120, 200, 40);
    }
}