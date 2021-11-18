package ua.stakhorskiy.hw1;

public class Task1 {
    public static void main(String[] args) {
        String studentName = "Yuriy";
        String studentLastname = "Stakhorskiy";
        System.out.println("Student's first and last name: " + studentName + " " + studentLastname);

        String nameLength = studentName.length() > 7 ? "more than 7" : "less than 7";
        System.out.println("Name length " + nameLength);

        int value = 5;
        for (int i = 0; i <= 10; i++, value += 2) {
            System.out.println("Шаг " + i + ", значение " + value);
        }
    }
}
