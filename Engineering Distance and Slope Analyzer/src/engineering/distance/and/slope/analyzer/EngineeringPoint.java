/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package engineering.distance.and.slope.analyzer;

/**
 *
 * @author GUBANTES_CPE113
 */
public class EngineeringPoint {

    // Variables
    private double x;
    private double y;

    // Constructor
    public EngineeringPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Calculate distance
    public double calculateDistance(EngineeringPoint point) {

        double dx = point.x - x;
        double dy = point.y - y;

        double distance = Math.sqrt(
                Math.pow(dx, 2) + Math.pow(dy, 2));

        return distance;
    }

    // Calculate slope
    public double calculateSlope(EngineeringPoint point) {

        double dx = point.x - x;
        double dy = point.y - y;

        if (dx == 0) {
            return Double.NaN;
        } else {
            double slope = dy / dx;
            return slope;
        }
    }
}