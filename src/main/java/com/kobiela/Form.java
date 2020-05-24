package com.kobiela;

import org.jfree.ui.RefineryUtilities;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Kalkulator odległości między domem a sklepem");
        frame.setContentPane(new Form().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        RefineryUtilities.centerFrameOnScreen(frame);
    }

    private JPanel panel1;
    private JButton button;
    private JTextField name1;
    private JTextField coordX1;
    private JTextField coordY1;
    private JTextField name2;
    private JTextField name3;
    private JTextArea textArea1;
    private JTextField coordX2;
    private JTextField coordX3;
    private JTextField coordY2;
    private JTextField coordY3;
    private JTextField name4;
    private JTextField coordX4;
    private JTextField coordY4;
    private JButton button2;
    private JButton fill;
    private JButton draw;

    public Form() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    //Create points for calculations
                    Point first = new Point(name1.getText(), Double.parseDouble(coordX1.getText()), Double.parseDouble(coordY1.getText()));
                    Point second = new Point(name2.getText(), Double.parseDouble(coordX2.getText()), Double.parseDouble(coordY2.getText()));
                    Point third = new Point(name3.getText(), Double.parseDouble(coordX3.getText()), Double.parseDouble(coordY3.getText()));
                    Point forth = new Point(name4.getText(),Double.parseDouble(coordX4.getText()), Double.parseDouble(coordY4.getText()));

                    System.out.println("-------------------------------------------------");
                    System.out.println("Test pliku Calculate.java: ");

                    //calculate between home and first old shop
                    Calculate distance1 = new Calculate(first.getNazwa(), first.getX(), first.getY(), second.getNazwa(), second.getX(), second.getY());
                    //calculate distance between home and new shop
                    Calculate distance2 = new Calculate(first.getNazwa(), first.getX(), first.getY(), third.getNazwa(), third.getX(), third.getY());
                    //calculate distance between home and second shop
                    Calculate distance3 = new Calculate(first.getNazwa(), first.getX(), first.getY(), forth.getNazwa(), forth.getX(), forth.getY());

                    String winner = "";
                    String looser = "";
                    String winner2 ="";
                    double difference = 0;
                    double difference2 = 0;
                    double howfar = 0;
                    //where is closer? new shop or second shop
                    if (distance2.getDst() < distance3.getDst()) {
                            winner = third.getNazwa();
                            difference = distance3.getDst() - distance2.getDst();
                            difference = Math.floor(difference * 100) / 100;
                            looser = forth.getNazwa();
                            howfar = distance2.getDst();
                    }
                    else
                    {
                            winner = forth.getNazwa();
                            difference = distance2.getDst() - distance3.getDst();
                            difference = Math.floor(difference * 100) / 100;
                            looser = third.getNazwa();
                            howfar = distance3.getDst();
                    }

                    //difference between distance to old shop and the winner
                    if (distance1.getDst() < howfar)
                    {
                        difference2 = howfar - distance1.getDst();
                        difference2 = Math.floor(difference2 * 100) / 100;
                        winner2 = second.getNazwa();
                    }
                    else
                    {
                        difference2 = distance1.getDst() - howfar;
                        difference2 = Math.floor(difference2 * 100) / 100;
                        winner2 = winner;
                    }

                    //Checking in terminal if everything is OK
                    System.out.println("-------------------------------------------------");
                    System.out.println("Test obliczeń w pliku Form.java: ");
                    System.out.println("Różnica między starym sklepem a najbliższym nowym: " + difference2);
                    System.out.println("Sprawdzenie poprawności obliczenia różnicy: " + (howfar - distance1.getDst()));
                    System.out.println("Odległość do pierwszego sklepu z get.Dst(): " + distance1.getDst());
                    System.out.println("Odległość do najbliższego nowego sklepu: " + howfar);

                    //Fill textarea
                    textArea1.setText("Odległość między " + first.getNazwa() +" a "+ second.getNazwa() + " wynosi " + Double.toString(distance1.getDst()) + " km"
                            + "\n" + "Odległość między " + first.getNazwa() +" a "+ third.getNazwa() + " wynosi " + Double.toString(distance2.getDst()) + " km"
                            + "\n" + "Odległość między " + first.getNazwa() +" a "+ forth.getNazwa() + " wynosi " + Double.toString(distance3.getDst()) + " km"
                            + "\n" + "Bliżej jest do " + winner + " niż do " + looser + " i różnica wynosi " + difference + " km"
                            + "\n" + "Najbliżej od domu mamy do sklepu " + winner2 + ". Różnica odległości wynosi " + difference2 + " km");
                }
                catch (Exception exp) {

                    //If anything wrong, popup appears
                    JOptionPane.showMessageDialog(null, "Wprowadzone wartości są niepoprawne lub ich brakuje." + "\n" +"Uzupełnij poprawnymi danymi, lub skorzystaj z przycisku UZUPEŁNIJ.", "Niepoprawne dane", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("-------------------------------------------------");
                    System.out.println("Któraś wartość nie została wprowadzona lub jest niepoprawna i nie można przeprowadzić obliczeń.");
                }
            }
        });
        //Clear button
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name1.setText("");
                name2.setText("");
                name3.setText("");
                name4.setText("");
                coordX1.setText("");
                coordX2.setText("");
                coordX3.setText("");
                coordX4.setText("");
                coordY1.setText("");
                coordY2.setText("");
                coordY3.setText("");
                coordY4.setText("");
                textArea1.setText("");
            }
        });
        //Fill button
        fill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name1.setText("Dom");
                name2.setText("Żabka stara");
                name3.setText("Żabka nowa");
                name4.setText("Biedronka");
                coordX1.setText("0");
                coordX2.setText("1.2");
                coordX3.setText("5.5");
                coordX4.setText("3.3");
                coordY1.setText("0");
                coordY2.setText("2.5");
                coordY3.setText("-2.3");
                coordY4.setText("2.7");
            }
        });
        //Draw button
        draw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Point first = new Point(name1.getText(), Double.parseDouble(coordX1.getText()), Double.parseDouble(coordY1.getText()));
                    Point second = new Point(name2.getText(), Double.parseDouble(coordX2.getText()), Double.parseDouble(coordY2.getText()));
                    Point third = new Point(name3.getText(), Double.parseDouble(coordX3.getText()), Double.parseDouble(coordY3.getText()));
                    Point forth = new Point(name4.getText(), Double.parseDouble(coordX4.getText()), Double.parseDouble(coordY4.getText()));
                    XYSeriesDemo.main(null, first.getX(), second.getX(), third.getX(), forth.getX(), first.getY(), second.getY(), third.getY(), forth.getY());
                    // XYSeriesDemo.main(null, 0, 1.2, 5.5, 3.3, 0, 2.5, -2.3, 2.7);
                }
                catch (Exception exp) {

                    //If anything wrong, popup appears
                    JOptionPane.showMessageDialog(null, "Wprowadzone wartości są niepoprawne lub ich brakuje - nie można narysować wykresu.", "Niepoprawne dane", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("-------------------------------------------------");
                    System.out.println("Któraś wartość nie została wprowadzona lub jest niepoprawna i nie można narysować wykresu.");
                }
            }
        });
    }
}


