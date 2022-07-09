package lesson14;

import java.io.Closeable;
import java.io.IOException;

public class ImplementsDemo implements Closeable  {

    public static void main(String[] args)  {


        tryWithResource();



    }

    @Override
        public void close () throws IOException {
            System.out.println("Я все закрыл!!!");
        }

       public static void tryWithResource (){
        try (ImplementsDemo value = new ImplementsDemo()) {
        value.generalTest();
    } catch(IOException exception) {
            exception.printStackTrace();
        System.out.println("Что-то не то, какое - исключение ");
    }
    }

    public void generalTest() {
        System.out.println("Самый главный текст");
    }
}



