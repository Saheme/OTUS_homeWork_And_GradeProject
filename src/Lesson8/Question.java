package Lesson8;

public class Question {
    private String quest;
    private String[] variant;
    private int right;

    public Question() {
    }


    Question(String quest, String[] variant, int right) {
        this.quest = quest;
        this.variant = variant;
        this.right = right;
    }

    /*  public void setQuestAndVariantAndRight(String quest,String[] variant, int[] right ){
        this.quest = quest;
         this.variant = variant;
         this.right = right; */
    public void printWinner() {
        System.out.println(quest);
    }

    public void setVariant(String[] variant) {
        this.variant = variant;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public String getQuest() {
        return quest;
    }

    public String[] getVariant() {
        return variant;
    }

    public int getRight() {
        return right;
    }


}
