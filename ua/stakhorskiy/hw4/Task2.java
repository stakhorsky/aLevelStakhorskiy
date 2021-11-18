package ua.stakhorskiy.hw4;

public class Task2 {
    public static void main(String[] args) {
        short leftNumber;
        short rightNumber;
        String tempNumber;
        short count = 0;
        for (int i = 1001; i <= 999999; i++) {
            rightNumber = 0;
            leftNumber = 0;
            tempNumber = String.valueOf(i).substring(String.valueOf(i).length() - 3);
            for (int j = 0; j <= String.valueOf(i).length() - 3; j++) {
                rightNumber += (short) tempNumber.charAt(j);
            }
            tempNumber = String.valueOf(i).substring(0, String.valueOf(i).length() - 3);
            for (int j = 0; j <= String.valueOf(i).length() - 3; j++) {
                rightNumber +=  (short) tempNumber.charAt(j);
            }

            System.out.println("i+ " + i + " leftNumber: " + leftNumber + " rightNumber: " + rightNumber);
            //rightNumber = Short.parseShort(String.valueOf(i).substring(String.valueOf(i).length() - 3));
            //leftNumber = Short.parseShort(String.valueOf(i).substring(0, String.valueOf(i).length() - 3));

            if (rightNumber == leftNumber) {
                count++;
            }

            if (i > 1990) {
                break;
            }
        }
        System.out.println("Number of lucky tickets: " + count);
    }
}
