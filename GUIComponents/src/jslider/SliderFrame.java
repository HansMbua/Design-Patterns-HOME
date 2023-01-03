package jslider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderFrame extends JFrame {

    private final JSlider diameterJSlider;
    private final OvalPanel myPanel;


    public SliderFrame(){
        super("Slider Demo");
        this.diameterJSlider = new JSlider(SwingConstants.HORIZONTAL,0,200,10);
        this.myPanel = new OvalPanel();
        myPanel.setBackground(Color.yellow);

        //set up JSlider to control diameter value;
        diameterJSlider.setMajorTickSpacing(10); // create tick every 10 spacing
        diameterJSlider.setPaintTicks(true); // paint ticks on slider
        diameterJSlider.addChangeListener(

                new ChangeListener(){
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        myPanel.setDiameter(diameterJSlider.getValue());
                    }
                }


        );

        add(diameterJSlider, BorderLayout.SOUTH);
        add(myPanel, BorderLayout.CENTER);




    }
}
