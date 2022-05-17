package Lesson8;

import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        Data test = new Data();
       /* Data question = new Data();
        Data variant = new Data();
        Data rightAnswer = new Data(); */

        test.question = new String[]{"Столица Канады", "С каким океаном не граничит Канада",
                "Самая длинная река Канады", "Самая высокая гора в Канаде"};

        test.variant = new String[][]{{"Ванкувер", "Торонто", "Оттава", "Монреаль"},
                {"Атлантический океан", "Тихий океан", "Южный океан", "Северный Ледовитый океан"},
                {"Юкон", "Колумбия", "Маккензи", "Пис"},
                {"Вуд", "Кинг Пик", "Ванкувер", "Логан"}};

        test.rightAnswer = new int[]{3, 3, 1, 4};

        int countRightAnswer = 0;
        int countWrongAnswer = 0;

        for (int i = 0; i < test.question.length; i++) {
            System.out.println(test.question[i]);

            for (int j = 0; j < test.question.length; j++) {
                int q = j + 1;
                System.out.println(q + " " + test.variant[i][j]);
            }
            // Сканер и счетчик
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            if (input == test.rightAnswer[i]) {
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

