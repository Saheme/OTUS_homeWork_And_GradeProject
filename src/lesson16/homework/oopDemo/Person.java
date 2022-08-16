package lesson16.homework.oopDemo;


public abstract class Person implements Worker {
    private String fullName;
    private String gender;

    public String getName() {
        return fullName;
    }

    public Person(String name, String gender) {
        this.fullName = name;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public Person(String name) {
        this.fullName = name;


    }

    public abstract void sayHello();

}
