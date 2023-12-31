package lesson16;


import lesson16.game.DiceImpl;
import lesson16.game.Game;
import lesson16.game.GameWinnerConsolePrinter;
import lesson16.game.Player;
import lesson16.game.metod.NewRoll;
import lesson16.game.metod.newGameWinnerConsolePrinter;

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
        playGameLogicTest();
         rollTest();

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
            PrintStream old = System.out;
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream stream = new PrintStream(outputStream);
            System.setOut(stream);
            new Game(new NewRoll(), new GameWinnerConsolePrinter()).playGame(new Player("Вася"), new Player("Игорь"));

            String actual = outputStream.toString(); //Преобразовываем данные из массива ByteArray в строку

            System.setOut(old);
            String expected = "Победитель: Вася\r\n";
            out.println(actual + expected);
            if (Objects.equals(actual, expected)) {
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










//PrintStream old = out;
//System.setOut(old);






/*ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); //Создаем динамический массив где будем хранить то что вывод на консоль
        PrintStream stream = new PrintStream(outputStream); //   Создаем Дашу
        Player name1 = new Player("Вася");
        new Game(new NewRoll(), new GameWinnerConsolePrinter()).playGame(name1, new Player("Игорь")); //передаем лопату и вызываем Колю
        System.setOut(stream); //задаем копать Даше
        PrintStream temp = System.out;*/












