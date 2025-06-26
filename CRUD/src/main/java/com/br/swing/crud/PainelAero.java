package com.br.swing.crud;

import javax.swing.*;
import java.awt.*;

public class PainelAero extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        GradientPaint grad = new GradientPaint(
                0, 0, new Color(180, 230, 255),
                0, getHeight(), new Color(100, 200, 255));
        g2.setPaint(grad);
        g2.fillRect(0, 0, getWidth(), getHeight());
    }
}
