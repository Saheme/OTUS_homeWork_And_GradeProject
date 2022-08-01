package lesson16.homework.src.main.java.ru.otus.game.metod;

import lesson16.homework.src.main.java.ru.otus.game.GameWinnerPrinter;
import lesson16.homework.src.main.java.ru.otus.game.Player;

public class newGameWinnerConsolePrinter implements GameWinnerPrinter {

  Player winner;

  public newGameWinnerConsolePrinter(Player winner){
      this.winner = winner;
  }


    @Override
    public void printWinner(Player winner){

        //this.winner = winner;

       // NewRoll.count = 6;


        try{
            if(this.winner == winner){

                System.out.println("Метод работает правильно");
            }else {
                throw new Exception();
            }
            }catch (Exception exception) {
                exception.printStackTrace();
                System.out.println("Все упало!!! Переменная winner глючит" );
            }
    }
}
