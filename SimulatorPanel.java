import java.awt.*;
import javax.swing.ImageIcon;    
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.lang.model.util.ElementScanner6;

import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.AbstractAction;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

public class SimulatorPanel extends JPanel implements ActionListener
{
    private int count;
    private JButton gen;
    private JButton run;
    private JLabel icon1;
    private JLabel icon2;
    private JLabel icon3;
    private JLabel icon4;
    private JLabel icon5;
    private JLabel icon6;
    private JLabel icon7;
    private JLabel icon8;
    private JLabel icon9;
    private JLabel icon10;
    private JLabel icon11;
    private JLabel icon12;
    private JLabel icon13;
    private JLabel icon14;
    private JLabel icon15;
    private JLabel icon16;
    private JLabel icon17;
    private JLabel icon18;
    private JLabel icon19;
    private JLabel icon20;
    private JLabel icon21;
    private JLabel icon22;
    private JLabel icon23;
    private JLabel icon24;
    private JLabel icon25;
    private JTextField ans;
    private JTextArea rules;
    private JScrollPane scroll;
    private String jawab;
    private String text = "Graph hasnt been generated yet";
    private ImageIcon path = new ImageIcon("C:/Users/Hp/Desktop/portfolio/oop/src/assets/path.png");;
    private ImageIcon stump = new ImageIcon("C:/Users/Hp/Desktop/portfolio/oop/src/assets/stump.png");
    private ImageIcon tree = new ImageIcon("C:/Users/Hp/Desktop/portfolio/oop/src/assets/tree.png");
    private ImageIcon ghost = new ImageIcon("C:/Users/Hp/Desktop/portfolio/oop/src/assets/ghost.gif");
    private ImageIcon victtt = new ImageIcon("C:/Users/Hp/Desktop/portfolio/oop/src/assets/Stone_Golem_Anim.gif");
    private ImageIcon sarrr = new ImageIcon("C:/Users/Hp/Desktop/portfolio/oop/src/assets/Wilderness_Golem_Anim.gif");

    private JTextArea textArea;


    //-----------------------------------------------------------------
    // Constructor: Sets up the GUI.
    //-----------------------------------------------------------------
    public SimulatorPanel ()
    {
        rules = new JTextArea(16, 58);
        rules.setEditable(false); // set textArea non-editable
        rules.setText
        (
            "\nPress generate and run to generate graph and run it, \n The green shadow shows where the SAR team is \n The black shadow shows where the victim is \n Stumps are harder to pass than paths, \n while trees are harder to pass than stumps \n and monsters being the hardest to pass \n\n DIRECTORY \n  1   2   3   4   5  \n  6   7   8   9  10 \n 11 12 13 14 15 \n 16 17 18 19 20 \n 21 22 23 24 25"    
        );
        Dimension sizerules = rules.getPreferredSize();
        rules.setBounds(600, 40, sizerules.width, sizerules.height);
        add (rules);
        rules.setLineWrap(true);
        rules.setWrapStyleWord(true);  
        scroll = new JScrollPane(rules);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(550, 40, 400, 250);
        add (scroll);
        ans = new JTextField();
        ans.setText(text);
        Dimension sizetext = ans.getPreferredSize();
        ans.setBounds(550, 300, sizetext.width, sizetext.height);
        add (ans);
        setLayout(null);
        ans.setEditable(false);
        //ImageIcon path = new ImageIcon("C:/Users/Hp/Desktop/more tests/path.png");
        
        gen = new JButton ("Generate and Run");
        run = new JButton ("Run");
        ans = new JTextField();
        //ans.setText(text);
        //add (ans);
        //Dimension sizetext = ans.getPreferredSize();
        //ans.setBounds(250, 450, 160, sizetext.height);

		
	
        setDoubleBuffered(true);
        Dimension sizee = gen.getPreferredSize();
        gen.setBounds(10, 40, sizee.width, sizee.height);
        Dimension sizeee = run.getPreferredSize();
        run.setBounds(30, 50, sizeee.width, sizeee.height);
        icon1 = new JLabel(path);
        Dimension size = icon1.getPreferredSize();
        icon1.setBounds(150, 50, size.width, size.height);
        icon2 = new JLabel(path);
        Dimension size2 = icon2.getPreferredSize();
        icon2.setBounds(230, 50, size2.width, size2.height);
        icon3 = new JLabel(path);
        Dimension size3 = icon3.getPreferredSize();
        icon3.setBounds(310, 50, size3.width, size3.height);
        icon4 = new JLabel(path);
        Dimension size4 = icon4.getPreferredSize();
        icon4.setBounds(390, 50, size4.width, size4.height);
        icon5 = new JLabel(path);
        Dimension size5 = icon5.getPreferredSize();
        icon5.setBounds(470, 50, size5.width, size5.height);
        icon6 = new JLabel(path);
        Dimension size6 = icon6.getPreferredSize();
        icon6.setBounds(150, 130, size6.width, size6.height);
        icon7 = new JLabel(path);
        Dimension size7 = icon7.getPreferredSize();
        icon7.setBounds(230, 130, size7.width, size7.height);
        icon8 = new JLabel(path);
        Dimension size8 = icon8.getPreferredSize();
        icon8.setBounds(310, 130, size8.width, size8.height);
        icon9 = new JLabel(path);
        Dimension size9 = icon9.getPreferredSize();
        icon9.setBounds(390, 130, size9.width, size9.height);
        icon10 = new JLabel(path);
        Dimension size10 = icon10.getPreferredSize();
        icon10.setBounds(470, 130, size10.width, size10.height);
        icon11 = new JLabel(path);
        Dimension size11 = icon11.getPreferredSize();
        icon11.setBounds(150, 210, size11.width, size11.height);
        icon12 = new JLabel(path);
        Dimension size12 = icon12.getPreferredSize();
        icon12.setBounds(230, 210, size12.width, size12.height);
        icon13 = new JLabel(path);
        Dimension size13 = icon13.getPreferredSize();
        icon13.setBounds(310, 210, size13.width, size13.height);
        icon14 = new JLabel(path);
        Dimension size14 = icon14.getPreferredSize();
        icon14.setBounds(390, 210, size14.width, size14.height);
        icon15 = new JLabel(path);
        Dimension size15 = icon15.getPreferredSize();
        icon15.setBounds(470, 210, size15.width, size15.height);
        icon16 = new JLabel(path);
        Dimension size16 = icon16.getPreferredSize();
        icon16.setBounds(150, 290, size16.width, size16.height);
        icon17 = new JLabel(path);
        Dimension size17 = icon17.getPreferredSize();
        icon17.setBounds(230, 290, size17.width, size17.height);
        icon18 = new JLabel(path);
        Dimension size18 = icon18.getPreferredSize();
        icon18.setBounds(310, 290, size18.width, size18.height);
        icon19 = new JLabel(path);
        Dimension size19 = icon19.getPreferredSize();
        icon19.setBounds(390, 290, size19.width, size19.height);
        icon20 = new JLabel(path);
        Dimension size20 = icon20.getPreferredSize();
        icon20.setBounds(470, 290, size20.width, size20.height);
        icon21 = new JLabel(path);
        Dimension size21 = icon21.getPreferredSize();
        icon21.setBounds(150, 370, size21.width, size21.height);
        icon22 = new JLabel(path);
        Dimension size22 = icon22.getPreferredSize();
        icon22.setBounds(230, 370, size22.width, size22.height);
        icon23 = new JLabel(path);
        Dimension size23 = icon23.getPreferredSize();
        icon23.setBounds(310, 370, size23.width, size23.height);
        icon24 = new JLabel(path);
        Dimension size24 = icon24.getPreferredSize();
        icon24.setBounds(390, 370, size24.width, size24.height);
        icon25 = new JLabel(path);
        Dimension size25 = icon25.getPreferredSize();
        icon25.setBounds(470, 370, size25.width, size25.height);
        add (icon1);
        add (icon2);
        add (icon3);
        add (icon4);
        add (icon5);
        add (icon6);
        add (icon7);
        add (icon8);
        add (icon9);
        add (icon10);
        add (icon11);
        add (icon12);
        add (icon13);
        add (icon14);
        add (icon15);
        add (icon16);
        add (icon17);
        add (icon18);
        add (icon19);
        add (icon20);
        add (icon21);
        add (icon22);
        add (icon23);
        add (icon24);
        add (icon25);
        gen.addActionListener(this);
        gen.setActionCommand("generate");
        run.addActionListener(this);
        run.setActionCommand("run");
        add (gen);
        //add (run);
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        //add (label);
        setBackground (new Color(0, 179, 54));
        setPreferredSize (new Dimension(1000, 500));
        
    }
    
    //*****************************************************************
    // Represents a listener for button push (action) events.
    //*****************************************************************
    public void actionPerformed(ActionEvent ae) {
        String action = ae.getActionCommand();
        Core c = new Core();
        if (action.equals("generate")) 
        {
            c.gen();
            int sar=c.getsar();
            int vict=c.getvict();
            int n=0;
            if(n==sar)
            {
                icon1.setIcon(sarrr);
            }
            else if (n==vict)
            {
                icon1.setIcon(victtt);
            }
            else if (c.getweight(n)==0)
            {
                icon1.setIcon(path);
            }
            else if (c.getweight(n)==1)
            {
                icon1.setIcon(stump);
            }
            else if(c.getweight(n)==2)
            {
                icon1.setIcon(tree);
            }
            else
            {
                icon1.setIcon(ghost);
            }
            n++;
            if(n==sar)
            {
                icon2.setIcon(sarrr);
            }
            else if (n==vict)
            {
                icon2.setIcon(victtt);
            }
            else if (c.getweight(n)==0)
            {
                icon2.setIcon(path);
            }
            else if (c.getweight(n)==1)
            {
                icon2.setIcon(stump);
            }
            else if(c.getweight(n)==2)
            {
                icon2.setIcon(tree);
            }
            else
            {
                icon2.setIcon(ghost);
            }
            n++;
            if(n==sar)
            {
                icon3.setIcon(sarrr);
            }
            else if (n==vict)
            {
                icon3.setIcon(victtt);
            }
            else if (c.getweight(n)==0)
            {
                icon3.setIcon(path);
            }
            else if (c.getweight(n)==1)
            {
                icon3.setIcon(stump);
            }
            else if(c.getweight(n)==2)
            {
                icon3.setIcon(tree);
            }
            else
            {
                icon3.setIcon(ghost);
            }
            n++;
            if(n==sar)
            {
                icon4.setIcon(sarrr);
            }
            else if (n==vict)
            {
                icon4.setIcon(victtt);
            }
            else if (c.getweight(n)==0)
            {
                icon4.setIcon(path);
            }
            else if (c.getweight(n)==1)
            {
                icon4.setIcon(stump);
            }
            else if(c.getweight(n)==2)
            {
                icon4.setIcon(tree);
            }
            else
            {
                icon4.setIcon(ghost);
            }
            n++;
            if(n==sar)
            {
                icon5.setIcon(sarrr);
            }
            else if (n==vict)
            {
                icon5.setIcon(victtt);
            }
            else if (c.getweight(n)==0)
            {
                icon5.setIcon(path);
            }
            else if (c.getweight(n)==1)
            {
                icon5.setIcon(stump);
            }
            else if(c.getweight(n)==2)
            {
                icon5.setIcon(tree);
            }
            else
            {
                icon5.setIcon(ghost);
            }
            n++;
            if(n==sar)
            {
                icon6.setIcon(sarrr);
            }
            else if (n==vict)
            {
                icon6.setIcon(victtt);
            }
            else if (c.getweight(n)==0)
            {
                icon6.setIcon(path);
            }
            else if (c.getweight(n)==1)
            {
                icon6.setIcon(stump);
            }
            else if(c.getweight(n)==2)
            {
                icon6.setIcon(tree);
            }
            else
            {
                icon6.setIcon(ghost);
            }
            n++;
            if(n==sar)
            {
                icon7.setIcon(sarrr);
            }
            else if (n==vict)
            {
                icon7.setIcon(victtt);
            }
            else if (c.getweight(n)==0)
            {
                icon7.setIcon(path);
            }
            else if (c.getweight(n)==1)
            {
                icon7.setIcon(stump);
            }
            else if(c.getweight(n)==2)
            {
                icon7.setIcon(tree);
            }
            else
            {
                icon7.setIcon(ghost);
            }
            n++;
            if(n==sar)
            {
                icon8.setIcon(sarrr);
            }
            else if (n==vict)
            {
                icon8.setIcon(victtt);
            }
            else if (c.getweight(n)==0)
            {
                icon8.setIcon(path);
            }
            else if (c.getweight(n)==1)
            {
                icon8.setIcon(stump);
            }
            else if(c.getweight(n)==2)
            {
                icon8.setIcon(tree);
            }
            else
            {
                icon8.setIcon(ghost);
            }
            n++;
            if(n==sar)
            {
                icon9.setIcon(sarrr);
            }
            else if (n==vict)
            {
                icon9.setIcon(victtt);
            }
            else if (c.getweight(n)==0)
            {
                icon9.setIcon(path);
            }
            else if (c.getweight(n)==1)
            {
                icon9.setIcon(stump);
            }
            else if(c.getweight(n)==2)
            {
                icon9.setIcon(tree);
            }
            else
            {
                icon9.setIcon(ghost);
            }
            n++;
            if(n==sar)
            {
                icon10.setIcon(sarrr);
            }
            else if (n==vict)
            {
                icon10.setIcon(victtt);
            }
            else if (c.getweight(n)==0)
            {
                icon10.setIcon(path);
            }
            else if (c.getweight(n)==1)
            {
                icon10.setIcon(stump);
            }
            else if(c.getweight(n)==2)
            {
                icon10.setIcon(tree);
            }
            else
            {
                icon10.setIcon(ghost);
            }
            n++;
            if(n==sar)
            {
                icon11.setIcon(sarrr);
            }
            else if (n==vict)
            {
                icon11.setIcon(victtt);
            }
            else if (c.getweight(n)==0)
            {
                icon11.setIcon(path);
            }
            else if (c.getweight(n)==1)
            {
                icon11.setIcon(stump);
            }
            else if(c.getweight(n)==2)
            {
                icon11.setIcon(tree);
            }
            else
            {
                icon11.setIcon(ghost);
            }
            n++;
            if(n==sar)
            {
                icon12.setIcon(sarrr);
            }
            else if (n==vict)
            {
                icon12.setIcon(victtt);
            }
            else if (c.getweight(n)==0)
            {
                icon12.setIcon(path);
            }
            else if (c.getweight(n)==1)
            {
                icon12.setIcon(stump);
            }
            else if(c.getweight(n)==2)
            {
                icon12.setIcon(tree);
            }
            else
            {
                icon12.setIcon(ghost);
            }
            n++;
            if(n==sar)
            {
                icon13.setIcon(sarrr);
            }
            else if (n==vict)
            {
                icon13.setIcon(victtt);
            }
            else if (c.getweight(n)==0)
            {
                icon13.setIcon(path);
            }
            else if (c.getweight(n)==1)
            {
                icon13.setIcon(stump);
            }
            else if(c.getweight(n)==2)
            {
                icon13.setIcon(tree);
            }
            else
            {
                icon13.setIcon(ghost);
            }
            n++;
            if(n==sar)
            {
                icon14.setIcon(sarrr);
            }
            else if (n==vict)
            {
                icon14.setIcon(victtt);
            }
            else if (c.getweight(n)==0)
            {
                icon14.setIcon(path);
            }
            else if (c.getweight(n)==1)
            {
                icon14.setIcon(stump);
            }
            else if(c.getweight(n)==2)
            {
                icon14.setIcon(tree);
            }
            else
            {
                icon14.setIcon(ghost);
            }
            n++;
            if(n==sar)
            {
                icon15.setIcon(sarrr);
            }
            else if (n==vict)
            {
                icon15.setIcon(victtt);
            }
            else if (c.getweight(n)==0)
            {
                icon15.setIcon(path);
            }
            else if (c.getweight(n)==1)
            {
                icon15.setIcon(stump);
            }
            else if(c.getweight(n)==2)
            {
                icon15.setIcon(tree);
            }
            else
            {
                icon15.setIcon(ghost);
            }
            n++;
            if(n==sar)
            {
                icon16.setIcon(sarrr);
            }
            else if (n==vict)
            {
                icon16.setIcon(victtt);
            }
            else if (c.getweight(n)==0)
            {
                icon16.setIcon(path);
            }
            else if (c.getweight(n)==1)
            {
                icon16.setIcon(stump);
            }
            else if(c.getweight(n)==2)
            {
                icon16.setIcon(tree);
            }
            else
            {
                icon16.setIcon(ghost);
            }
            n++;
            if(n==sar)
            {
                icon17.setIcon(sarrr);
            }
            else if (n==vict)
            {
                icon17.setIcon(victtt);
            }
            else if (c.getweight(n)==0)
            {
                icon17.setIcon(path);
            }
            else if (c.getweight(n)==1)
            {
                icon17.setIcon(stump);
            }
            else if(c.getweight(n)==2)
            {
                icon17.setIcon(tree);
            }
            else
            {
                icon17.setIcon(ghost);
            }
            n++;
            if(n==sar)
            {
                icon18.setIcon(sarrr);
            }
            else if (n==vict)
            {
                icon18.setIcon(victtt);
            }
            else if (c.getweight(n)==0)
            {
                icon18.setIcon(path);
            }
            else if (c.getweight(n)==1)
            {
                icon18.setIcon(stump);
            }
            else if(c.getweight(n)==2)
            {
                icon18.setIcon(tree);
            }
            else
            {
                icon18.setIcon(ghost);
            }
            n++;
            if(n==sar)
            {
                icon19.setIcon(sarrr);
            }
            else if (n==vict)
            {
                icon19.setIcon(victtt);
            }
            else if (c.getweight(n)==0)
            {
                icon19.setIcon(path);
            }
            else if (c.getweight(n)==1)
            {
                icon19.setIcon(stump);
            }
            else if(c.getweight(n)==2)
            {
                icon19.setIcon(tree);
            }
            else
            {
                icon19.setIcon(ghost);
            }
            n++;
            if(n==sar)
            {
                icon20.setIcon(sarrr);
            }
            else if (n==vict)
            {
                icon20.setIcon(victtt);
            }
            else if (c.getweight(n)==0)
            {
                icon20.setIcon(path);
            }
            else if (c.getweight(n)==1)
            {
                icon20.setIcon(stump);
            }
            else if(c.getweight(n)==2)
            {
                icon20.setIcon(tree);
            }
            else
            {
                icon20.setIcon(ghost);
            }
            n++;
            if(n==sar)
            {
                icon21.setIcon(sarrr);
            }
            else if (n==vict)
            {
                icon21.setIcon(victtt);
            }
            else if (c.getweight(n)==0)
            {
                icon21.setIcon(path);
            }
            else if (c.getweight(n)==1)
            {
                icon21.setIcon(stump);
            }
            else if(c.getweight(n)==2)
            {
                icon21.setIcon(tree);
            }
            else
            {
                icon21.setIcon(ghost);
            }
            n++;
            if(n==sar)
            {
                icon22.setIcon(sarrr);
            }
            else if (n==vict)
            {
                icon22.setIcon(victtt);
            }
            else if (c.getweight(n)==0)
            {
                icon22.setIcon(path);
            }
            else if (c.getweight(n)==1)
            {
                icon22.setIcon(stump);
            }
            else if(c.getweight(n)==2)
            {
                icon22.setIcon(tree);
            }
            else
            {
                icon22.setIcon(ghost);
            }
            n++;
            if(n==sar)
            {
                icon23.setIcon(sarrr);
            }
            else if (n==vict)
            {
                icon23.setIcon(victtt);
            }
            else if (c.getweight(n)==0)
            {
                icon23.setIcon(path);
            }
            else if (c.getweight(n)==1)
            {
                icon23.setIcon(stump);
            }
            else if(c.getweight(n)==2)
            {
                icon23.setIcon(tree);
            }
            else
            {
                icon23.setIcon(ghost);
            }
            n++;
            if(n==sar)
            {
                icon24.setIcon(sarrr);
            }
            else if (n==vict)
            {
                icon24.setIcon(victtt);
            }
            else if (c.getweight(n)==0)
            {
                icon24.setIcon(path);
            }
            else if (c.getweight(n)==1)
            {
                icon24.setIcon(stump);
            }
            else if(c.getweight(n)==2)
            {
                icon24.setIcon(tree);
            }
            else
            {
                icon24.setIcon(ghost);
            }
            n++;
            if(n==sar)
            {
                icon25.setIcon(sarrr);
            }
            else if (n==vict)
            {
                icon25.setIcon(victtt);
            }
            else if (c.getweight(n)==0)
            {
                icon25.setIcon(path);
            }
            else if (c.getweight(n)==1)
            {
                icon25.setIcon(stump);
            }
            else if(c.getweight(n)==2)
            {
                icon25.setIcon(tree);
            }
            else
            {
                icon25.setIcon(ghost);
            }
            //string s= c.run();
            //System.out.Println (s);
            
            jawab=c.run();
            System.out.println(jawab);
            ans.setText(jawab);
            //ans = new JTextField();
            Dimension sizetext = ans.getPreferredSize();
            ans.setBounds(550, 300, 400, sizetext.height);
            add (ans);
            
        }
    }
 
}