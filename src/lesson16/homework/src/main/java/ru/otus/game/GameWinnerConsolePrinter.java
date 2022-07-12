package lesson16.homework.src.main.java.ru.otus.game;

public class GameWinnerConsolePrinter implements GameWinnerPrinter {
    @Override
    public void printWinner(Player winner) {  // реализует метод interface printWinner
        System.out.printf("Победитель: %s%n", winner.getName());
    }   // метод печатает имя победителя
}
