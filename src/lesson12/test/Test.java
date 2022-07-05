package lesson12.test;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Продукт milk = new Продукт();
        milk.name = "milk";
        Продукт Fairy = new Продукт();
        Fairy.name = "Fairy";
        Продукт potato = new Продукт();
        potato.name = "potato";
        Пакет пакет = new Пакет();

        Пакет пакет2 = new Пакет();
        пакет2.продукты = new Продукт[]{Fairy, potato, milk, Fairy};
        // пакет.продукты[0].name;
        пакет.продукты = new Продукт[]{milk, Fairy, potato};

        List<Пакет> багажник = new ArrayList<>();
        багажник.add(пакет);
        багажник.add(пакет2);
        for (int i = 0; i < багажник.size(); i++) {
            Пакет value = багажник.get(i);
            Продукт[] value1 = value.продукты;
            for (int j = 0; j < value1.length; j++) {

                //       System.out.println(value1[j].name);

            }
            // System.out.println();
        }
    }
}
