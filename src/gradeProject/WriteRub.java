package gradeProject;

public class WriteRub implements WriteWords {



    @Override
    public String rewriteNumber(int number) {
        if (number % 10 == 1 && number % 100 != 11) {
            return "рубль";
        } else if (number % 10 == 2 || number % 10 == 3 || number % 10 == 4) {
            return "рубля";
        } else {
            return "рублей";
        }
    }
}
