package ua.stakhorskiy.hw4;

import java.util.Scanner;

public class Task0 {

    public static void main(String[] args) {
        Scanner keyInput = new Scanner(System.in);
        System.out.print("Please enter string: ");
        String enterString = keyInput.nextLine();
        keyInput.close();
        System.out.println(getWordCount(enterString.toLowerCase()));
    }

    private static int getWordCount(String inText) {
        // Банальный подсчет количества пробелов может выдать ложно-положительный результат
        // т.к. слова в строке могут разделяться разным количеством пробелов
        // поэтому мы добавляем дополнительный флаг проверка слова
        int count = 0;
        boolean isWord = false;
        String tempWord = "";
        for (int i = 0; i < inText.length(); i++) {
            if (inText.charAt(i) == ' ') {
                if (isWord) {
                    if (isValidWord(tempWord)) {
                        count++;
                    }
                    tempWord = "";
                }
                isWord = false;
            } else {
                tempWord += inText.charAt(i);
                isWord = true;
            }
        }
        // Можно было бы обойтись без дополнительной проверки и инициализировать счетчик count начиная с 1
        // но в таком случае если после последнего слова будет стоять пробел программа выдаст ложно-положительный результат
        if (isWord) {
            if (isValidWord(tempWord)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isValidChar(char inChar) {
        // Если находим в слове английскую букву тогда true
        for (int i = 97; i < 123; i++) {
            if (inChar == i) {
                return true;
            }
        }
        // Если находим в слове русскую букву тогда true - кодировка 1
        for (int i = 224; i < 258; i++) {
            if (inChar == i) {
                return true;
            }
        }
        // Если находим в слове русскую букву тогда true - кодировка 2
        for (int i = 1072; i < 1106; i++) {
            if (inChar == i) {
                return true;
            }
        }
        return false;
    }

    private static boolean isValidWord(String inText) {
        for (int i = 0; i < inText.length(); i++) {
            if (isValidChar(inText.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}