package Lesson11;

public class ArrayTest {
    public static void main(String[] args) {
        Numbers array1 = new Numbers(new int[3]);
        for (int i = 0; i <array1.array.length; i++){
            array1.array[i] =(int)(Math.random() * 10);
            System.out.print(array1.array[i]);
        }
        Numbers array2 = new Numbers(new int[5]);
        for (int j = 0; j <array2.array.length; j++){
            array2.array[j] =(int)(Math.random() * 10);
            System.out.println(array2.array[j]);
        }

    }
}
