import java.util.*;
import java.util.*;
import java.awt.*;
import javax.swing.ImageIcon;    
import javax.swing.JFrame;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

class Proj
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame ("SAR Simulator");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        SimulatorPanel panel = new SimulatorPanel();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        
        //Core c = new Core();
        //c.gen();
        //c.run();
    }
}