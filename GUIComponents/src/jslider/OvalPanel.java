package jslider;

import javax.swing.*;
import java.awt.*;

public class OvalPanel extends JPanel {



    private int diameter = 10;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(10,10,diameter,diameter);
    }


    public void setDiameter(int diameter) {
       // if diameter is invalid default to 10;
        this.diameter = (diameter >= 0? diameter : 10); // if diameter is greater than zero return diameter else return 10;

        repaint();   // repaint panel
    }

    // used by layout Manager to determine preferred size
    public Dimension getPreferredSize(){
        return new Dimension(200,200);
    }

    public Dimension getMinimumSize(){
        return getPreferredSize();
    }


}
