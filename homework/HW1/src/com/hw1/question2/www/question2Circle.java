package com.hw1.question2.www;

public class question2Circle {

    public Circle(double r){
       setRadius(r);
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }
    protected double radius;

}


