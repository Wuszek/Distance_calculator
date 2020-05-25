package com.kobiela;

import org.jfree.chart.ChartPanel;
import org.knowm.xchart.*;
import org.knowm.xchart.style.Styler;
import org.knowm.xchart.style.markers.SeriesMarkers;

import javax.swing.*;
import java.awt.*;

public class XChart extends JFrame {

        public static void main(String[] args, double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4) {

            // Create Chart
            final XYChart chart =
                    new XYChartBuilder()
                            .width(600)
                            .height(400)
                            .title("Distance from Home")
                            .xAxisTitle("X")
                            .yAxisTitle("Y")
                            .build();

            // Customize Chart
            chart.getStyler().setLegendPosition(Styler.LegendPosition.OutsideS);
            chart.getStyler().setLegendLayout(Styler.LegendLayout.Horizontal);
            //chart.getStyler().setDefaultSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Area);

            // Series

            chart.addSeries("Home->Shop1", new double[] {x1, x2}, new double[] {y1, y2});
            chart.addSeries("Home->Shop2", new double[] {x1, x3}, new double[] {y1, y3});
            chart.addSeries("Home->Shop3", new double[] {x1, x4}, new double[] {y1, y4});


            // Schedule a job for the event-dispatching thread:
            // creating and showing this application's GUI.
            javax.swing.SwingUtilities.invokeLater(
                    new Runnable() {

                        @Override
                        public void run() {

                            // Create and set up the window.
                            JFrame frame = new JFrame("Distance chart");
                            frame.setLayout(new BorderLayout());
                            frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

                            // chart
                            JPanel chartPanel = new XChartPanel<XYChart>(chart);
                            frame.add(chartPanel, BorderLayout.CENTER);

                            // label
                            //JLabel label = new JLabel("Blah blah blah.", SwingConstants.CENTER);
                            //frame.add(label, BorderLayout.SOUTH);

                            // Display the window.
                            frame.pack();
                            frame.setVisible(true);

                            System.out.println("-------------------------------------------------");
                            System.out.println("Wykres narysowany poprawnie.");
                        }
                    });
        }
    }
