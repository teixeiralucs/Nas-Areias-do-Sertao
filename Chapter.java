import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashMap;

public class Chapter {
    protected String title;
    protected String text;
    protected ArrayList<Choice> choices;
    protected Persona character;
    protected int modifier;
    protected String end;
    Scanner ChapterScan = new Scanner (System.in);
    
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

    public ArrayList<Choice> getChoices() {
        return choices;
    }

    public void setChoices(Choice choice) {
        choices.add(choice);
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
    

    public Chapter (String title, String text, ArrayList<Choice> choices, Persona character, int modifier, String end){
        this.title = title ;
        this.text = text;
        this.character = character;
        this.modifier = modifier;
        this.end = end;
        this.choices = choices;
    }

        public Chapter(Scanner ChapterScan, HashMap<String, Persona> personaMap, Scanner FileReader){
        this.ChapterScan = ChapterScan;
        this.choices = new ArrayList<Choice>();
        this.ChapterReader(personaMap, FileReader);
    
        }
        protected void ChapterReader (HashMap<String, Persona> personaMap, Scanner FileReader){
            FileReader.nextLine();
            String ID = FileReader.nextLine();
            this.character = personaMap.get(character);
            FileReader.nextLine();
            String line = FileReader.nextLine();
            this.text = "";
            while(!line.equalsIgnoreCase("MAIN")){
                this.text += line + "\n";
                line = FileReader.nextLine();
            }
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
        if (choices != null){
        while(loop == true){
            Scanner reader = new Scanner (System.in);
            String type = reader.nextLine();
            for(Choice choices : choices){
                if(choices.getanswer().equalsIgnoreCase(type)){
                    loop = false;
                    Chapter next = choices.getnext();
                    next.run();


        }
        System.out.println("Escolha invalida! Tente novamente!");
        System.out.println(this.choices);
        reader.close();    
        
    }
} 
}
}
}
