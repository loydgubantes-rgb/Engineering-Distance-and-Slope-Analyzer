/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package engineering.distance.and.slope.analyzer;

/**
 *
 * @author GUBANTES_CPE113
 */


public class EngineeringDistanceSlopeAnalyzer {

    public static void main(String[] args) {

        EngineeringPoint pointA = new EngineeringPoint(3, 4);
        EngineeringPoint pointB = new EngineeringPoint(9, 12);
        EngineeringPoint pointC = new EngineeringPoint(12, 4);

        System.out.println("===== ENGINEERING DISTANCE AND SLOPE ANALYZER =====");

        System.out.printf("Point A: (%.2f, %.2f)",
                pointA.getX(), pointA.getY());

        System.out.printf("Point B: (%.2f, %.2f)",
                pointB.getX(), pointB.getY());

        System.out.printf("Point C: (%.2f, %.2f)",
                pointC.getX(), pointC.getY());

        System.out.println("----- Point A and Point B -----");

        double distance = pointA.calculateDistance(pointB);
        double slope = pointA.calculateSlope(pointB);

        System.out.printf("Distance: %.2f units", distance);

        if (Double.isNaN(slope)) {
            System.out.println("Slope: Undefined");
        } else {
            System.out.printf("Slope: %.2f", slope);
        }

        System.out.println("----- Point A and Point C -----");

        distance = pointA.calculateDistance(pointC);
        slope = pointA.calculateSlope(pointC);

        System.out.printf("Distance: %.2f units", distance);

        if (Double.isNaN(slope)) {
            System.out.println("Slope: Undefined");
        } else {
            System.out.printf("Slope: %.2f", slope);
        }

        System.out.println("----- Point B and Point C -----");

        distance = pointB.calculateDistance(pointC);
        slope = pointB.calculateSlope(pointC);

        System.out.printf("Distance: %.2f units", distance);

        if (Double.isNaN(slope)) {
            System.out.println("Slope: Undefined");
        } else {
            System.out.printf("Slope: %.2f", slope);
        }

    }
}
