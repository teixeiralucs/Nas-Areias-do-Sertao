public class Choice {
    private String answer;
    private Chapter next;

    public Choice( String answer, Chapter next) {
        this.answer = answer;
        this.next = next;
}
public String getanswer() {
    return answer;
}
public Chapter getnext() {
    return next;
}
public String getAnswer() {
    return answer;
}
public void setAnswer(String answer) {
    this.answer = answer;
}
public Chapter getNext() {
    return next;
}
public void setNext(Chapter next) {
    this.next = next;
}
}