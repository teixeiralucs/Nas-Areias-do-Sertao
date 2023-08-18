
import java.util.Scanner;
public class Chapter {
    String title;
    String text;
    String[] choices;
    Persona character;
    int modifier;
    String end;
    Scanner reader = new Scanner (System.in);
    

    public Chapter (String title, String text, String[] choices, Persona character, int modifier, String end){
        this.title = title ;
        this.text = text;
        this.character = character;
        this.modifier = modifier;
        this.end = end;
        this.choices = choices;
    }
    
    public void show(){
        System.out.println(this.title);
        System.out.println(this.text);
        if (choices != null){
            for (String choice: choices){
                System.out.println(choice);
            }
        }
        
        if (modifier != 0){
            this.character.changeEnergy(modifier);
        System.out.println(this.end);
        }
    }
    int choose (String[] choices){
        String answer = reader. nextLine();
        int result = 0;
        for (int i = 0; i < choices.length; i++){
            if (choices[i].equalsIgnoreCase(answer)){
                result = i;
            }
        }
       
        return result;    
        
    } 
}


