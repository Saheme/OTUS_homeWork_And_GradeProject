package Lesson11;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        Numbers array1 = new Numbers(new int[10]);
        for (int i = 0; i <array1.array.length; i++){
            array1.array[i] =(int)(Math.random() * 10);
        }
            System.out.print(Arrays.toString(array1.array));



        System.out.println();
        Arrays.sort(array1.array);
        System.out.println(Arrays.toString(array1.array));

        System.out.println();
        Numbers array2 = new Numbers(new int[10]);
        for (int j = 0; j <array2.array.length; j++){
            array2.array[j] =(int)(Math.random() * 10);
            System.out.print(array2.array[j] + " ");
        }


    }
}
