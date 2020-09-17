package ru.mirea;

public class Circle {
    private static final double PI = 3.14;
    private double radius = 0;
    private double circumference = 0;
    private double square = 0;
    public double getRadius(){
        return radius;
    }
    public double getCircumference(){
        return circumference;
    }
    public double getSquare(){
        return square;
    }
    public void setCircleViaRadius(double radius){
        this.radius = radius;
        circumference = 2 * PI * radius;
        square = PI * Math.pow(radius, 2);
    }
    public void setCircleViaCircumference(double circumference){
        this.circumference = circumference;
        radius = circumference / (2 * PI);
        square = PI * Math.pow(radius, 2);
    }
    public void setCircleViaSquare(double square){
        this.square= square;
        radius = Math.pow(square / PI, 0.5);
        circumference = 2 * PI * radius;
    }
}
