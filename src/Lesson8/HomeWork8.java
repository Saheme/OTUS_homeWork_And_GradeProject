package Lesson8;

import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {

        Question q1 = new Question();
        q1.quest = "Столица Канады";
        q1.variant = new String[]{"Ванкувер", "Торонто", "Оттава", "Монреаль"};
        q1.right = 3;

        Question q2 = new Question();
        q2.quest = "С каким океаном не граничит Канада";
        q2.variant = new String[]{"Атлантический океан", "Тихий океан", "Северный Ледовитый океан", "Южный океан"};
        q2.right = 4;

        Question q3 = new Question();
        q3.quest = "Самая длинная река Канады";
        q3.variant = new String[]{"Юкон", "Колумбия", "Маккензи", "Пис"};
        q3.right = 1;

        Question q4 = new Question();
        q4.quest = "Самая высокая гора в Канаде";
        q4.variant = new String[]{"Вуд", "Кинг Пик", "Ванкувер", "Логан"};
        q4.right = 4;

        Question[] arrayQuest = {q1, q2, q3, q4};

        int countRightAnswer = 0;
        int countWrongAnswer = 0;

        for (Question question : arrayQuest) {

            System.out.println(question.quest);

            for (int j = 0; j < question.variant.length; j++) {
                int q = j + 1;
                System.out.println(q + " " + question.variant[j]);
            }


            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            if (input == question.right) {
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

