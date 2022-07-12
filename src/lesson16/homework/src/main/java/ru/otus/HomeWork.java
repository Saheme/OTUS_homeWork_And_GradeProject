package lesson16.homework.src.main.java.ru.otus;


import com.sun.nio.sctp.Association;

import java.util.Random;

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

          rollTest();
        rollLessNull();

    }

    public static void rollLessNull() {
        try {
            int a = 0;
            int b = new Random().nextInt();
            if (b > a) {
                System.out.println("b= "+ b + "\t "+ "a= " + a);
                System.out.println("Тест прошел Число больше " );
            } else {
                throw new Exception();
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("Все упало, меньше 0!!!");
        }
    }

    public static void rollTest() {
        try {
            int a = 0;
            int b = new Random().nextInt();
            if (b == a||b<=6) {
                System.out.println(b + " " + a);
                System.out.println("Тест прошел");
            } else {
                throw new Exception();
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("Все упало!!! Число не в диапазоне от 0 до 6");
        }
    }


}









