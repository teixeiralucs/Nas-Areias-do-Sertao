
import java.util.Scanner;

public class Chapter {
    private String title;
    private String text;
    private Choice[] choices;
    private Persona character;
    private int modifier;
    private String end;
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Choice[] getChoices() {
        return choices;
    }

    public void setChoices(Choice[] choices) {
        this.choices = choices;
    }

    public int getModifier() {
        return modifier;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Object getRun() {
        return run;
    }

    public void setRun(Object run) {
        this.run = run;
    }
    public Object run;
    

    public Chapter (String title, String text, Choice[] choices, Persona character, int modifier, String end){
        this.title = title ;
        this.text = text;
        this.character = character;
        this.modifier = modifier;
        this.end = end;
        this.choices = choices;
    }
    
    public void run(){
        show();
        choose();
    }
    public void show(){
        System.out.println(this.title);
        System.out.println(this.text);
        
        if (modifier != 0){
            this.character.changeEnergy(modifier);
        System.out.println(this.end);
        }
    }
    public void choose(){
        boolean loop = true;
        if (choices.length == 1){
        while(loop == true){
            Scanner reader = new Scanner (System.in);
            String type = reader.nextLine();
            for(Choice choices : choices){
                if(choices.getanswer().equalsIgnoreCase(type)){
                    loop = false;
                    Chapter next = choices.getnext();
                    next.run();
            }

        }
        System.out.println("Escolha invalida! Tente novamente!");
        System.out.println(this.choices);    
        
    }
} 
if (choices.length == 2){
        while(loop == true){
            Scanner reader = new Scanner (System.in);
            String type = reader.nextLine();
            for(Choice choices : choices){
                if(choices.getanswer().equalsIgnoreCase(type)){
                    loop = false;
                    Chapter next = choices.getnext();
                    next.run();
            }

        }
        System.out.println("Escolha invalida! Tente novamente!");
        System.out.println(this.choices);    
        
    }
} 
}
}
