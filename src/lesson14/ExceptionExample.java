package lesson14;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static jdk.internal.net.http.common.Utils.close;


public class ExceptionExample {
    public static void main(String[] args) throws IOException {
       try {

            unsafe(10);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("число не в заданном диапазоне" + " " + e.getMessage());
        }


        newFileWriting("MyFile.txt", "Мама мыла раму\n пока\n Папа пил виски");
        newFileReading("MyFile.txt");
        newFileReadingUsual("MyFile.txt");

    }

    public static void unsafe(int value) throws Exception {

        if (value > 0) {
            throw new Exception();
        }
    }

    public static void moreHighLevel() {
        try {
            throw new Exception("Oops");
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public static void newFileWriting(String fileName, String value) {
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(value);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static void newFileReading(String fileName) {
        try (FileReader fr = new FileReader(fileName)) {

            Scanner scanner = new Scanner(fr);
            int i = 0;
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
                i++;
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static void newFileReadingUsual(String fileName) {
        FileReader fr = null;
        try {
            fr = new FileReader(fileName);
            Scanner scanner = new Scanner(fr);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
            ;
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}





