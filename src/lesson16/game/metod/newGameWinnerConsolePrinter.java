package lesson16.game.metod;

import lesson16.game.GameWinnerPrinter;
import lesson16.game.Player;

public class newGameWinnerConsolePrinter implements GameWinnerPrinter {

  Player winner;

  public newGameWinnerConsolePrinter(Player winner){
      this.winner = winner;
  }


    @Override
    public void printWinner(Player winner){
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
