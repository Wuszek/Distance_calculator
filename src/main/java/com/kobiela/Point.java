package com.kobiela;

public class Point {

    private String nazwa;
    private double zmiennaX;
    private double zmiennaY;

    public Point(String name, double x, double y) {
        this.nazwa  = name;
        this.zmiennaX = x;
        this.zmiennaY = y;
    }

    //return the value of X and Y
    public String getNazwa() {
        return nazwa;
    }
    public double getX() {
        return zmiennaX;
    }
    public double getY() {
        return zmiennaY;
    }

    //setters, so we set new values for point
    public void setX(double zmienna) {
        zmiennaX = zmienna;
    }
    public void setY(double zmienna) {
        zmiennaY = zmienna;
    }

}
