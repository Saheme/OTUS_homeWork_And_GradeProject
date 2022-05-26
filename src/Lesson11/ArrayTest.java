package Lesson11;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        Numbers array1 = new Numbers(new int[10]);
        for (int i = 0; i < array1.array.length; i++) {
            array1.array[i] = (int) (Math.random() * 10);
        }
        System.out.print("Изначальный массив" + " " + Arrays.toString(array1.array));

        System.out.println();
        long start = System.nanoTime();

        Arrays.sort(array1.array);
        long stop = System.nanoTime();
        System.out.println("Стандартная сортировка Java" + " " + Arrays.toString(array1.array));
        System.out.println(stop - start);

        System.out.println();
        Numbers array2 = new Numbers(new int[10]);
        for (int i = 0; i < array2.array.length; i++) {
            array2.array[i] = (int) (Math.random() * 10);
        }
        System.out.print("Изначальный массив" + " " + Arrays.toString(array2.array));
        System.out.println();
        long start2 = System.nanoTime();
        int bufer;
        boolean statusSort = false;
        while (!statusSort) {
            statusSort = true;
            for (int i = 1; i < array2.array.length; i++) {
                if (array2.array[i] < array2.array[i - 1]) {
                    bufer = array2.array[i];
                    array2.array[i] = array2.array[i - 1];
                    array2.array[i - 1] = bufer;
                    statusSort = false;
                }

            }
            System.out.println("Пузырьковая сортировка " + " " + Arrays.toString(array2.array));
        }
            long stop2 = System.nanoTime();
            System.out.println(stop2 - start2);


    }
}



