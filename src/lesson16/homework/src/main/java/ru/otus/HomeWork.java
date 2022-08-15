package lesson16.homework.src.main.java.ru.otus;


import lesson16.homework.src.main.java.ru.otus.game.*;
import lesson16.homework.src.main.java.ru.otus.game.metod.NewRoll;
import lesson16.homework.src.main.java.ru.otus.game.metod.newGameWinnerConsolePrinter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Objects;

import static java.lang.System.out;

public class HomeWork {

    /*
        Заготовка для ДЗ представляет собой игру в кости.
        При вызове game.playGame(), два игрока кидают кости.
        Выигрывает игрок, у кого результат (1-6) больше

        Написать тесты (минимум 4) на классы DiceImpl и Game.
        Тесты должны найти не менее двух ошибок.

        Информацию о пройденном тесте предлагается выводить в System.out, а об упавшем в System.err
     */
    public static void main(String[] args) {

        outputTest();
        //playGameLogicTest();
        // rollTest();

    }


    public static void rollTest() {
        try {
            int a = 0;
            int c = 6;
            int b = new DiceImpl().roll();
            if (b > a && b <= c) {
                out.println("b = " + b + "\t " + "a = " + a);
                out.println("Тест прошел");
            } else {
                throw new Exception();
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            out.println("Все упало!!! Число не в диапазоне от 0 до 6");
        }
    }


    public static void playGameLogicTest() {
        Player name1 = new Player("Вася");

        new Game(new NewRoll(), new newGameWinnerConsolePrinter(name1)).playGame(name1, new Player("Игорь"));

    }

    public static void outputTest() {
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream stream = new PrintStream(outputStream);
            new Game(new NewRoll(), new GameWinnerConsolePrinter()).playGame(new Player("Вася"), new Player("Игорь"));
            PrintStream old = out;
            System.setOut(stream);
            String actual = outputStream.toString(); //Преобразовываем данные из массива ByteArray в строку
            out.flush();
            System.setOut(old);
            String expected = "Победитель: Вася";
            out.println(actual + expected);
            if (actual == expected) {
                out.println("Тест прошел");
            } else {
                throw new IOException();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
            out.println("Поток выводит не то что надо");
        }
    }
}


















/*ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); //Создаем динамический массив где будем хранить то что вывод на консоль
        PrintStream stream = new PrintStream(outputStream); //   Создаем Дашу
        Player name1 = new Player("Вася");
        new Game(new NewRoll(), new GameWinnerConsolePrinter()).playGame(name1, new Player("Игорь")); //передаем лопату и вызываем Колю
        System.setOut(stream); //задаем копать Даше
        PrintStream temp = System.out;*/












