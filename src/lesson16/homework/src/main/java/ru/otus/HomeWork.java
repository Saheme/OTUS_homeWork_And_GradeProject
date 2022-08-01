package lesson16.homework.src.main.java.ru.otus;


import lesson16.homework.src.main.java.ru.otus.game.*;
import lesson16.homework.src.main.java.ru.otus.game.metod.NewRoll;
import lesson16.homework.src.main.java.ru.otus.game.metod.newGameWinnerConsolePrinter;

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

        playGameLogicTest();
        // rollTest();

        }




    public static void rollTest() {
        try {
            int a = 0;
            int c = 6;
            int b = new DiceImpl().roll();
            if (b > a && b <= c) {
                System.out.println("b = " + b + "\t " + "a = " + a);
                System.out.println("Тест прошел");
            } else {
                throw new Exception();
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("Все упало!!! Число не в диапазоне от 0 до 6");
        }
    }


    public static void playGameLogicTest() { Player name1 = new Player("Вася");

        new Game(new NewRoll(), new newGameWinnerConsolePrinter(name1)).playGame(name1, new Player("Игорь"));




    }
}












