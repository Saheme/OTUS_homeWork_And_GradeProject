package Lesson6;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        int rightAnswer = 0;
        int wrongAnswer = 0;
        String[] question = {"Столица Канады", "С каким океаном не граничит Канада",
                "Самая длинная река Канады", "Самая высокая гора в Канаде"};
        for (int i = 0; i < question.length; i++) {
            System.out.println(question[i]);
            String[][] variant = {{"Ванкувер", "Торонто", "Оттава", "Монреаль"},
                    {"Атлантический океан", "Тихий океан", "Южный океан", "Северный Ледовитый океан"},
                    {"Юкон", "Колумбия", "Маккензи", "Пис"},
                    {"Вуд", "Кинг Пик", "Ванкувер", "Логан"}};
            for (int j = 0; j < question.length; j++) {
                int q = j + 1;
                System.out.println(q + " " + variant[i][j]);
            }
            int[] answer = {3, 3, 1, 4};

            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            if (input == answer[i]) {
                System.out.println("Вы абсолютно правы! ");
                rightAnswer++;
            } else {
                System.out.println("Неправильно. ");
                wrongAnswer++;
            }

        }
        System.out.println();
        System.out.println("Правильных ответов " + rightAnswer);
        System.out.println("Неправильных ответов " + wrongAnswer);


    }
}

















