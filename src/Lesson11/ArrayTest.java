package Lesson11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayTest {
    public static void main(String[] args) {
        List<Integer> array1 = new ArrayList<>(10);
        array1.add(5);
        array1.add(7);
        array1.add(0);
        array1.add(9);
        array1.add(3);
        array1.add(7);
        array1.add(8);
        array1.add(4);
        array1.add(2);
        array1.add(1);
        System.out.println("Изначальный массив" + " " + array1);

        long start = System.nanoTime();
        Collections.sort(array1);
        long stop = System.nanoTime();
        System.out.println("Стандартная сортировка Java" + " " + array1);
        System.out.println((stop - start) / 1000 + " " + "микросекунд");

        List<Integer> array2 = new ArrayList<>(10);
        array2.add(3);
        array2.add(9);
        array2.add(4);
        array2.add(2);
        array2.add(8);
        array2.add(5);
        array2.add(6);
        array2.add(1);
        array2.add(7);
        array2.add(5);
        System.out.println("Изначальный массив" + " " + array2);

        long start2 = System.nanoTime();
        int bufer;
        boolean statusSort = false;
        while (!statusSort) {
            statusSort = true;
            for (int i = 1; i < array2.size(); i++) {
                if (array2.get(i) < array2.get(i - 1)) {
                    bufer = array2.get(i);
                    array2.set(i, array2.get(i - 1));
                    array2.set(i - 1, bufer);
                    statusSort = false;
                }

            }
            System.out.println("Пузырьковая сортировка " + " " + array2);
        }
        long stop2 = System.nanoTime();
        System.out.println((stop2 - start2) / 1000 + " " + "микросекунд");


    }
}


