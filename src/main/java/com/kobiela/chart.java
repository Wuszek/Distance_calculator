package com.kobiela;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.labels.StandardXYToolTipGenerator;
import org.jfree.chart.labels.XYItemLabelGenerator;
import org.jfree.chart.plot.Marker;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.time.Minute;
import org.jfree.data.xy.AbstractXYDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RectangleAnchor;
import org.jfree.ui.RefineryUtilities;
import org.jfree.ui.TextAnchor;
import org.jfree.chart.plot.Marker;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.plot.XYPlot;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


class XYSeriesDemo extends JFrame {

    /**
     * A demonstration application showing an XY series containing a null value.
     *
     * @param title  the frame title.
     */
    public XYSeriesDemo(final String title, double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4) {

        super(title);

        final JFreeChart chart = ChartFactory.createXYLineChart(
                "Wykres odległosci domu od sklepów",
                "X",
                "Y",
                createSampleDataset(x1,x2,x3,x4,y1,y2,y3,y4),
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

       final ChartPanel chartPanel = new ChartPanel(chart);
       chartPanel.setPreferredSize(new java.awt.Dimension(500, 400));
       setContentPane(chartPanel);

    }

    public XYDataset createSampleDataset(double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4) {
        XYSeries series1 = new XYSeries("Dom -> Sklep1");
        series1.add(x1,y1);
        series1.add(x2, y2);

        XYSeries series2 = new XYSeries("Dom -> Sklep nowy");
        series2.add(x1,y1);
        series2.add(x3, y3);

        XYSeries series3 = new XYSeries("Dom -> Sklep2");
        series3.add(x1, y1);
        series3.add(x4, y4);

     //   XYSeries series4 = new XYSeries("Series 4");
     //   series4.add(x1, y1);
      //  series4.add(x4, y4);


        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series1);
        dataset.addSeries(series2);
        dataset.addSeries(series3);
       // dataset.addSeries(series4);
        return dataset;
    }


// ****************************************************************************
// * JFREECHART DEVELOPER GUIDE                                               *
// * The JFreeChart Developer Guide, written by David Gilbert, is available   *
// * to purchase from Object Refinery Limited:                                *
// *                                                                          *
// * http://www.object-refinery.com/jfreechart/guide.html                     *
// *                                                                          *
// * Sales are used to provide funding for the JFreeChart project - please    *
// * support us so that we can continue developing free software.             *
// ****************************************************************************

    /**
     * Starting point for the demonstration application.
     *
     * @param args  ignored.
     */
    public static void main(String[] args, double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4) {

        //final XYSeriesDemo demo = new XYSeriesDemo("Wykres odległości", x1, x2, x3, x4, y1, y2, y3, y4);

        JFrame frame2 = new XYSeriesDemo("Wykres odległości", x1, x2, x3, x4, y1, y2, y3, y4);
        //frame.setContentPane(new XYSeriesDemo("Wykres odległości", x1, x2, x3, x4, y1, y2, y3, y4));
        frame2.setDefaultCloseOperation(frame2.DISPOSE_ON_CLOSE);
        frame2.pack();
        frame2.setVisible(true);

        System.out.println("-------------------------------------------------");
        System.out.println("Wykres narysowany poprawnie.");
      //  demo.pack();
      //  RefineryUtilities.centerFrameOnScreen(demo);
       // demo.setVisible(true);
      //  demo.setDefaultCloseOperation(HIDE_ON_CLOSE);

    }

}