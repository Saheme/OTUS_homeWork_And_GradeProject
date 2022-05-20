package Lesson8;

public class Question1 {
   private String quest;
    String[] variant;
    int right;
// класс конструктор по умолч.

    public Question1(){
        quest = "Столица";
    }
    public Question1(String quest, String[] variant, int right){
        this.quest = quest + "hello";
        this.main(quest);
    }

    public void main(String args) {
        System.out.println(args);
    }
    public String getQuest(){
        return quest;
    }
    public void setQuest(String q){
        quest = q;
    }


}
