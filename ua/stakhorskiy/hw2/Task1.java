package ua.stakhorskiy.hw2;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        // Task1
        System.out.println("Area of a triangle: " + getAreaTriangle(3, 4, 5));

        // Task2
        int numb1 = new Random().nextInt();
        int numb2 = new Random().nextInt();
        int numb3 = new Random().nextInt();
        System.out.println("From numbers: " + numb1 + " " + numb2 + " " + numb3
                + " smallest module: " + getSmallestModulusNumb(numb1, numb2, numb3));

        // Task3
        int numb = new Random().nextInt();
        isEvenNumb(numb);

        // Task4
        int numb4 = new Random().nextInt(999);
        System.out.println(decToBin(numb4));
    }

    // Find the area of a triangle
    private static double getAreaTriangle(double a, double b, double c) {
        double area = (a + b + c) * 0.5;
        return Math.sqrt(area * (area - a) * (area - b) * (area - c));
    }

    // Get the smallest modulus of a number
    private static int getSmallestModulusNumb(int numb1, int numb2, int numb3) {
        int temp, res;
        temp = Math.abs(numb1) < Math.abs(numb2) ? Math.abs(numb1) : Math.abs(numb2);
        res = Math.abs(temp) < Math.abs(numb3) ? Math.abs(temp) : Math.abs(numb3);
        return res;
    }

    // Check a number for evenness
    private static void isEvenNumb(int numb) {
        if (numb % 2 == 0) {
            System.out.println(numb + " even number");
        } else {
            System.out.println(numb + " odd number");
        }
    }

    // Decimal to binary
    public static String decToBin(int a) {
        int b;
        String temp = "";
        while (a != 0) {
            b = a % 2;
            temp = b + temp;
            a = a / 2;
        }
        return temp;
    }
}
