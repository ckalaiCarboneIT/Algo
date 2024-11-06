package com.codingame;

import java.util.Random;

public class EstimatePi {

    public static double approxPi(double[][] points) {
        int insideCircle = 0;
        int totalPoints = points.length;

        for (double[] point : points) {
            double x = point[0];
            double y = point[1];

            if (x * x + y * y <= 1) {
                insideCircle++;
            }
        }

        return 4.0 * insideCircle / totalPoints;
    }

    public static void main(String[] args) {
        int numPoints = Integer.MAX_VALUE/2 ;

        double[][] points = new double[numPoints][2];

        Random random = new Random();

        for (int i = 0; i < numPoints; i++) {
            points[i][0] = random.nextDouble();
            points[i][1] = random.nextDouble();
        }

        double estimatedPi = approxPi(points);

        System.out.println("Estimation de pi : " + estimatedPi);
    }
}
