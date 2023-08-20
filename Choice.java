public class Choice {
    String answer;
    Chapter next;

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
}