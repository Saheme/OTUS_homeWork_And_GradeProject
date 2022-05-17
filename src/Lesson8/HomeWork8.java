package Lesson8;

import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
       // Data test = new Data();
        Question q1 = new Question();
        q1.quest = "Столица Канады";
        q1.variant =new String[] {"Ванкувер","Торонто", "Оттава", "Монреаль"};
        q1.right = 3;

        Question q2 = new Question();
        q2.quest = "С каким океаном не граничит Канада";
        q2.variant = new String[] {"Атлантический океан", "Тихий океан", "Южный океан", "Северный Ледовитый океан"};
        q2.right = 3;

        Question[] arrayQuest = {q1, q2};


        //System.out.println(q1.quest);

        for (int i = 0; i < arrayQuest.length; i++) {

            System.out.println(arrayQuest[i].quest);
            for (int j = 0; j < q2.variant.length; j++) {
                int q = j + 1;
            System.out.println(q + " " + arrayQuest[i].variant[j]);

            }

        }

        /*test.question = new String[]{"Столица Канады", "С каким океаном не граничит Канада",
                "Самая длинная река Канады", "Самая высокая гора в Канаде"};

       test.variant = new String[][]{{"Ванкувер", "Торонто", "Оттава", "Монреаль"},
                {"Атлантический океан", "Тихий океан", "Южный океан", "Северный Ледовитый океан"},
                {"Юкон", "Колумбия", "Маккензи", "Пис"},
                {"Вуд", "Кинг Пик", "Ванкувер", "Логан"}};

        test.rightAnswer = new int[]{3, 3, 1, 4}; */

       // int countRightAnswer = 0;
        // int countWrongAnswer = 0;



        /*for (int j = 0; j < arrayQuest.length; j++) {
                int q = j + 1;
                System.out.println(q + " " + q1.variant[j]);
            }
            // Сканер и счетчик
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            if (input == q1.right) {
                System.out.println("Вы абсолютно правы! ");
                countRightAnswer++;
            } else {
                System.out.println("Неправильно. ");
                countWrongAnswer++;
            }

        System.out.println();
        System.out.println("Правильных ответов " + countRightAnswer);
        System.out.println("Неправильных ответов " + countWrongAnswer); */


    }


}

