package Lesson11;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        Numbers array1 = new Numbers(new int[20]);
        for (int i = 0; i <array1.array.length; i++){
            array1.array[i] =(int)(Math.random() * 10);
        }
            System.out.print("Изначальный массив" + " " + Arrays.toString(array1.array));

        System.out.println();

        Arrays.sort(array1.array);
        System.out.println("Стандартная сортировка Java" + " " + Arrays.toString(array1.array));

        System.out.println();
        Numbers array2 = new Numbers(new int[20]);
        for (int j = 0; j <array2.array.length; j++){
            array2.array[j] =(int)(Math.random() * 10);
        }
            System.out.print("Изначальный массив" + " " + Arrays.toString(array2.array));


    }
}
