/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author void1337
 */
public class GraficoHistograma extends MyPanel implements TiposGraficos{
    
    Graphics grafico;

    public GraficoHistograma(MainWindow mw) {
        super(mw);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        g.clearRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(Color.black);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        int outerSpace = 5;
        int innerSpace = 1;
        int QTD = numbers.size();
        int width = (this.getWidth() - 2 * outerSpace - (QTD - 1) * innerSpace) / QTD;
        int height = (this.getHeight() - 2 * outerSpace) / QTD;
        g.setColor(Color.white);
        for (int idx = 0; idx < QTD; idx++) {
            int n = numbers.get(idx);
            g.fillRect(idx * (width + innerSpace) + outerSpace, this.getHeight() - n * height - outerSpace, width, n * height);
        }
        this.grafico = g;
    }
    
}
