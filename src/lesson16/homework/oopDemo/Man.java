package lesson16.homework.oopDemo;

public class Man extends Person{


    public Man(String name) {
        super(name,"man");

        setGender("M");

    }

    @Override
    public void sayHello() {
        System.out.println("Hello man!");
    }



        @Override
        public void work() {
            System.out.println(" Man's working");

        }
    public void personInfo(){
        setGender("man");
        System.out.println("этого человека зовут :" + getName() + " " + getGender());
    }
    }

