package ru.geekbrains_java1_lesson_online;

import com.sun.prism.paint.Color;

import javax.swing.*;
import java.awt.*;

public class Map  extends JPanel {
    Map() {
        setBackground(Color.BLACK);
    }
    public void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLength) {
        System.out.printf("mode=%d, size=%d, len=%d\n, mode, fieldSizeX, winLength");
    }
}
