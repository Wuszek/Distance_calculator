package com.kobiela;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AboutWindow {


    private static JFrame frame2;
    private JButton OKButton;
    private JLabel Icon;
    private JPanel panel2;

    public static void main(String[] args) {

        frame2 = new JFrame("About");
        frame2.setContentPane(new AboutWindow().panel2);
        frame2.setPreferredSize(new Dimension(450, 300));
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame2.pack();
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(true);

    }

    public final JFrame getMainJFrame()
    {
        return frame2;
    }

    public AboutWindow() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getMainJFrame().dispose();
            }
        });
    }



//    public AboutWindow() {
//
//        JFrame frame2 = new JFrame("About");
//        frame2.setContentPane(new AboutWindow().panel2);
//        frame2.setPreferredSize(new Dimension(450, 300));
//        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        frame2.pack();
//        frame2.setLocationRelativeTo(null);
//        frame2.setVisible(true);
//
//
//        OKButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                frame2.dispose();
//            }
//        });
//    }

}
