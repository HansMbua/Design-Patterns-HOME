package MenuFramePakage;

import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MenuFrame extends JFrame {


    // creating an array of colors
    private final Color[] colorValues = {Color.BLACK, Color.BLUE, Color.RED, Color.GREEN};
    private final JRadioButtonMenuItem[] colorItems;
    private final JRadioButtonMenuItem[] fonts;
    private final JLabel displayLabel;
    private final JCheckBoxMenuItem[] styleItems;
    private final ButtonGroup fontButtonGroup;
    private final ButtonGroup colorButtonGroup;
    private int style;


    public MenuFrame(){
        super("Using JMenus");
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic('F');

        JMenuItem aboutItem = new JMenuItem("About....");
        aboutItem.setMnemonic('A');
        fileMenu.add(aboutItem);

        aboutItem.addActionListener(

                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(MenuFrame.this,"This is an Example\nof using Menus","about",JOptionPane.PLAIN_MESSAGE);
                    }
                }
        );

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setMnemonic('X');
        fileMenu.add(exitItem);

        exitItem.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                }
        );

        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);
        bar.add(fileMenu);

        JMenu formatMenu = new JMenu("Format");
        formatMenu.setMnemonic('R');
        String[] colors = { "Black", "Blue", "Red", "Green" };
        JMenu colorMenu = new JMenu("Color");
        colorMenu.setMnemonic('C');

        colorItems = new JRadioButtonMenuItem[colors.length];
        colorButtonGroup = new ButtonGroup();
        ItemHandler itemHandler = new ItemHandler();

        for (int count = 0; count < colors.length; count++){
            colorItems[count] = new JRadioButtonMenuItem(colors[count]);
            colorMenu.add(colorItems[count]);
            colorButtonGroup.add(colorItems[count]);
            colorItems[count].addActionListener(itemHandler);

        }
        colorItems[0].setSelected(true); // select the first color item
        formatMenu.add(colorMenu);
        formatMenu.addSeparator(); // add separators in menu

        String[] fontNames = { "Serif", "Monospaced", "SansSerif" };
        JMenu fontMenu = new JMenu("Font");
        fontMenu.setMnemonic('N');

        fonts = new JRadioButtonMenuItem[fontNames.length];
        fontButtonGroup = new ButtonGroup();
        for (int count = 0; count < fonts.length; count++){
            fonts[count] = new JRadioButtonMenuItem(fontNames[count]);
            fontMenu.add(fonts[count]);
            fontButtonGroup.add(fonts[count]);
            fonts[count].addActionListener(itemHandler);

        }
        fonts[0].setSelected(true);
        fontMenu.addSeparator();

        String[] styleNames = {"Bole", "Italic"};
        styleItems = new JCheckBoxMenuItem[styleNames.length];
        StyleHandler syleHandler = new StyleHandler();

        for (int count = 0; count < styleNames.length; count++){
            styleItems[count] = new JCheckBoxMenuItem(styleNames[count]);
            fontMenu.add(styleNames[count]);
            styleItems[count].addItemListener(syleHandler);

        }
        formatMenu.add(fontMenu);
        bar.add(formatMenu);

        displayLabel = new JLabel("Simple Text",SwingConstants.CENTER);
        displayLabel.setForeground(colorValues[0]);
        displayLabel.setFont(new Font("Serif",Font.PLAIN,72));
        getContentPane().setBackground(Color.CYAN);
        add(displayLabel, BorderLayout.CENTER);

    }

private class ItemHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int count = 0; count < colorItems.length; count++){
            if (colorItems[count].isSelected()){
                displayLabel.setForeground(colorValues[count]);
                break;
            }
        }
        // process font selection
        for (int count = 0; count < colorItems.length; count++){
            if (e.getSource() == fonts[count]){
                displayLabel.setFont(new Font(fonts[count].getText(), style,72));
            }
        }
        repaint();


    }
}

private class StyleHandler implements ItemListener{

        // process font style selections
    @Override
    public void itemStateChanged(ItemEvent e) {
        String name = displayLabel.getFont().getName();
        Font font; // new font base on user selections

        // determine which items are checked and create font
        if (styleItems[0].isSelected() && styleItems[1].isSelected()){
            font = new Font(name, Font.BOLD + Font.ITALIC, 72);
        }
        else if (styleItems[0].isSelected())
            font = new Font(name, Font.BOLD, 72);
        else if (styleItems[1].isSelected())
            font = new Font(name, Font.ITALIC, 72);
        else
            font = new Font(name,Font.PLAIN,72);

        displayLabel.setFont(font);
        repaint();
    }
}







}
