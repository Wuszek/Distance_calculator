package com.kobiela;


import lombok.Data;

@Data
public class Point {

    private String nazwa;
    private double X;
    private double Y;

    public Point(String name, double x, double y) {
        this.nazwa  = name;
        this.X = x;
        this.Y = y;
    }

//    //return the value of X and Y
//    public String getNazwa() {
//        return nazwa;
//    }
//    public double getX() {
//        return X;
//    }
//    public double getY() {
//        return Y;
//    }
//
//    //setters, so we set new values for point
//    public void setX(double zmienna) {
//        X = zmienna;
//    }
//    public void setY(double zmienna) {
//        Y = zmienna;
//    }

}
