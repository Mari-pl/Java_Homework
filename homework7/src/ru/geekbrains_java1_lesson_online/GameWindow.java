package ru.geekbrains_java1_lesson_online;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    private static final int WIN_WIDTH = 507;
    private static final int WIN_HEIGHT = 555;
    private static final int WIN_POSX = 650;
    private static final int WIN_POSY = 250;

    GameWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(WIN_POSX, WIN_POSY);
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setTitle("Tic Tac");
        setLayout(new GridLayout(2,3));
        setResizable(false);
        Map map = new Map();

        JButton btnStart = new JButton("Start");
        JButton btnExit = new JButton("Exit");

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });
        JPanel panelButtons = new JPanel(new GridLayout(1,2));
        panelButtons.add(btnStart);
        panelButtons.add(btnExit);
        add(map);
        add(panelButtons, BorderLayout.SOUTH);

        setVisible(true);
    }

}
