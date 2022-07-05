package lesson12.arrayTest;

public class ArrayTest {
    public static void main(String[] args) {
        Integer[][] array = {
                {},
                {1, 2, 3},
                null,
                {4, null, 6, 4},
                {4, null, 6, 7, 8, null}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < (array[i] != null ? array[i].length : 0) && array[i][j] != null ; j++) {
               // if (array[i][j] != null ) {

                System.out.println(array[i][j]); // i=4;j=0
            }

            System.out.println(" ====== ");
        }
    }
}
