package gradeProject;

public class ConvertingNumbersIntoWords implements WriteWords {


    @Override
    public String rewriteNumber(int number) {
        String[] upToTwenty = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
        String[] tens = {"сто","десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
        String[] hundreds = {"тысяча", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
        String value;

        if (number == 1000) {
            return (hundreds[0]);
        }
        if (number % 100 < 20 && number != 100) {
            value = upToTwenty[number % 100];
            number /= 100;
        } else {
            if (number == 100) {
                return (tens[0]);
            }
            value = upToTwenty[number % 10];
            number /= 10;

            value = tens[number % 10] + " " + value ;
            number /= 10;

        }
        if (number == 0) return value;

        return hundreds[number] + " " + value;
    }
}

