package Lesson8;

import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {

        Question q1 = new Question("Столица Канады", new String[]{"Ванкувер", "Торонто", "Оттава", "Монреаль"}, 3);
        Question q2 = new Question("С каким океаном не граничит Канада", new String[]{"Атлантический океан", "Тихий океан", "Северный Ледовитый океан", "Южный океан"}, 4);
        Question q3 = new Question("Самая длинная река Канады", new String[]{"Юкон", "Колумбия", "Маккензи", "Пис"}, 1);
        Question q4 = new Question("Самая высокая гора в Канаде", new String[]{"Вуд", "Кинг Пик", "Ванкувер", "Логан"}, 4);

        Question[] arrayQuest = {q1, q2, q3, q4};

        int countRightAnswer = 0;
        int countWrongAnswer = 0;

        for (int i = 0; i < arrayQuest.length; i++) {

            System.out.println(arrayQuest[i].quest);

            for (int j = 0; j < arrayQuest[i].variant.length; j++) {
                int q = j + 1;
                System.out.println(q + " " + arrayQuest[i].variant[j]);
            }

            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            if (input == arrayQuest[i].right) {
                System.out.println("Вы абсолютно правы! ");
                countRightAnswer++;
            } else {
                System.out.println("Неправильно. ");
                countWrongAnswer++;
            }
        }
        System.out.println();
        System.out.println("Правильных ответов " + countRightAnswer);
        System.out.println("Неправильных ответов " + countWrongAnswer);

    }
}
