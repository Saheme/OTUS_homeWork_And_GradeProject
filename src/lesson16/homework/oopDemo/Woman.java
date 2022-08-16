package lesson16.homework.oopDemo;

public class Woman extends Person {


    public Woman(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello woman!");
    }

    @Override
    public void work() {
        System.out.println("Woman isn't working");
    }

    public void personInfo(){
        setGender("woman");
        System.out.println("этого человека зовут :" + getName() + " " + getGender());
    }
}

