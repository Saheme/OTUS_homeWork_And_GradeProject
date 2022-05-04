package Lesson6;

import java.util.Scanner;

public class HomeWork6 {


    public static void main(String[] args) {
        int rightAnswer = 0;
        int wrongAnswer = 0;
        String capital = "Выберите столицу Канады";
        System.out.println(capital);
        System.out.println();
        String[] variant = {"Ванкувер ", "Торонто ", "Оттава ", "Монреаль "};
        for (int i = 0; variant.length > i; i++) {
            int q=i+1;
            System.out.println(q+" "+ variant[i]);
        }
        Scanner scan = new Scanner(System.in);
        int answer = scan.nextInt();
        if (answer == 3) {
            System.out.println("Вы абсолютно правы! ");
            rightAnswer++;
        } else {
            System.out.println("Неправильно. ");
            wrongAnswer++;
        }
        System.out.println();

        String ocean = "С каким океаном не граничит Канада";
        System.out.println(ocean);
        System.out.println();
        String[] variant2 = {"Атлантический океан", "Тихий океан", "Южный океан", "Северный Ледовитый океан"};
        for (int j = 0; variant2.length > j; j++) {
            int q=j+1;
            System.out.println(q+" "+variant2[j]);
        }
        int answer2 = scan.nextInt();
        if (answer2 == 3) {
            System.out.println("Вы абсолютно правы! ");
            rightAnswer++;
        } else {
            System.out.println("Неправильно. ");
            wrongAnswer++;
        }
        System.out.println();

        String river = "Самая длинная река Канады";
        System.out.println(river);
        System.out.println();
        String[] variant3 = {"Юкон", "Колумбия", "Маккензи", "Пис"};
        for (int k = 0; variant3.length > k; k++) {
            int q=k+1;
            System.out.println(q+ " "+variant3[k]);
        }
        int answer3 = scan.nextInt();
        if (answer3 == 1) {
            System.out.println("Вы абсолютно правы! ");
            rightAnswer++;
        } else {
            System.out.println("Неправильно. ");
            wrongAnswer++;
        }
        System.out.println();

        String mountain = "Самая высокая гора в Канаде";
        System.out.println(mountain);
        System.out.println();
        String[] variant4 = {"Вуд", "Ванкувер", "Кинг Пик", "Логан"};
        for (int m = 0; variant4.length > m; m++) {
            int q=m+1;
            System.out.println(q+" "+variant4[m]);
        }
        int answer4 = scan.nextInt();
        if (answer4 == 4) {
            System.out.println("Вы абсолютно правы! ");
            rightAnswer++;
        } else {
            System.out.println("Неправильно. ");
            wrongAnswer++;
        }
        System.out.println();
        System.out.println("Правильных ответов " + rightAnswer);
        System.out.println("Неправильных ответов " + wrongAnswer);
    }
}

















