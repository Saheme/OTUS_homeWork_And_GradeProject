package gradeProject;

import java.util.Scanner;

public class PriceInWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (checkRange(number)) break;
                ConvertingNumbersIntoWords value = new ConvertingNumbersIntoWords();
                WriteRub value1 = new WriteRub();
                Numbers value2 = new Numbers(value, value1);
                System.out.println(outputResult(number));
            }
        }
    }

    private static boolean checkRange(int number) {
        if (number < 0 || number > 1000) {
            System.out.println("Число не в диапазоне от 0 до 1000");
            return true;
        }
        return false;
    }
    public static String outputResult(int number) {
        String a = new ConvertingNumbersIntoWords().rewriteNumber(number);
        String b = new WriteRub().rewriteNumber(number);
        return a + " " + b;
    }

}
