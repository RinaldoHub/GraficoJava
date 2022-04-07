package view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JPanel;

public class MyPanel extends JPanel{

    /* UI Components */
    private final MainWindow frame;
    protected List<Integer> numbers;

    public MyPanel(MainWindow mw) {
        this.frame = mw;
    }
    
    private void createRandomizedArray(int qtd) {
        this.numbers = new ArrayList(qtd);
        for (int i = 1; i <= qtd; i++) {
            this.numbers.add(i);
        }
        Collections.shuffle(this.numbers);
    }

    public void shuffle() {
        int quantity = (Integer) this.frame.getsQuantity().getValue();
        this.createRandomizedArray(quantity);
        repaint();
    }
}
