package gradeProject.tests;

import gradeProject.ConvertingNumbersIntoWords;
import gradeProject.WriteRub;

public class Tests {


    public static void main(String[] args) {

        rewriteNumberTest(15, "пятнадцать");
        writeRubTest(53,"рубля");
        allMethodsTest(11,"одиннадцать","рублей");


    }

    public static void rewriteNumberTest(int number, String expected) {
        new ConvertingNumbersIntoWords().rewriteNumber(number);
        String real = new ConvertingNumbersIntoWords().rewriteNumber(number);
        System.out.println(real);
        System.out.println(expected);
        try {
            if (real == expected ) {
                System.out.println("Метод работает правильно");
            } else {
                throw new Exception();
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("Число переписывается не правильно");
        }
    }
    public static void writeRubTest(int number, String expected){
        String real = new WriteRub().rewriteNumber(number);
        System.out.println(real);
        System.out.println(expected);
        try {
            if (real == expected ) {
                System.out.println("Метод работает правильно");
            } else {
                throw new Exception();
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("Рубль должен быть другим");
        }
    }
    public static void allMethodsTest(int number, String expected,String expected1){
        String real = new ConvertingNumbersIntoWords().rewriteNumber(number);
        String real1 = new WriteRub().rewriteNumber(number);
        System.out.println(real+ " " + real1);
        //System.out.println(real1);
        System.out.println(expected + " " + expected1);
        try {
            if (real == expected && expected1 ==real1 ) {
                System.out.println("Метод работает правильно");
            } else {
                throw new Exception();
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("Либо не правильно переписывается число либо с рублем что-то не то");
        }
    }

    }





