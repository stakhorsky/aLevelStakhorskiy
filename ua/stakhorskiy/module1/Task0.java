package ua.stakhorskiy.module1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        // Task1
        int userInputSizeArray = userInputArraySize();

        // Task2
        double[] array = new double[userInputSizeArray];
        fillArray(array);

        // Task3
        System.out.println(Arrays.toString(array));

        // Task4
        int userInputSortMethod = userInputSortMethod(array);

        // Task6
        System.out.println(Arrays.toString(array));

        // Task7
        cubing(array);

        // Task8
        System.out.println(Arrays.toString(array));

        // Task10
        int[] lockArray = new int[5];
        final Lock lock = new Lock(lockArray);
        lock.printArray();
        lock.getLockArray()[0] = 10;
        lock.printArray();
        lock.getLockArray()[0] = 15;
        lock.printArray();
    }

    private static int userInputArraySize() {
        final Scanner scanner = new Scanner(System.in);
        int userInputSizeArray;
        while (true) {
            System.out.println("Please, enter size array >= 10 (0 - exit):");
            userInputSizeArray = scanner.nextInt();
            if (userInputSizeArray >= 10) {
                break;
            }
            if (userInputSizeArray == 0) {
                System.exit(0);
            }
        }
        return userInputSizeArray;
    }

    private static int userInputSortMethod(double[] array) {
        final Scanner scanner = new Scanner(System.in);
        int userInputSortMethod;
        while (true) {
            System.out.println("Please select a sort. 0 - exit. 1 - ascending. 2 - descending:");
            userInputSortMethod = scanner.nextInt();
            if (userInputSortMethod == 1) {
                sortArray(array, true);
                break;
            }
            if (userInputSortMethod == 2) {
                sortArray(array, false);
                break;
            }
            if (userInputSortMethod == 0) {
                System.exit(0);
            }
        }
        return userInputSortMethod;
    }

    private static void fillArray(double[] array) {
        Random random = new Random();
        int lowerBound = -100;
        int upperBound = 100;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(upperBound - lowerBound) + lowerBound;
        }
    }

    // Task5
    private static void sortArray(double[] array, boolean sort) {
        double temp;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if ((sort && (array[i] > array[i + 1])) || (!sort && (array[i] < array[i + 1]))) {
                    isSorted = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

    private static void cubing(double[] array) {
        for (int i = 2; i < array.length; i += 3) {
            array[i] = Math.pow(array[i], 3);
        }
    }
}

class Lock {
    private final int[] lockArray;

    public Lock(int[] lockArray) {
        this.lockArray = lockArray == null ? null : lockArray.clone();
    }

    public int[] getLockArray() {
        return lockArray == null ? null : lockArray.clone();
    }

    public void printArray() {
        System.out.println(Arrays.toString(lockArray));
    }
}