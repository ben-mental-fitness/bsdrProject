package Controllers;

public class Tuple<Integer, String> {
    public final Integer questionID;
    public final String question;
    public Tuple(Integer x, String y) {
        this.questionID = x;
        this.question = y;
    }
}