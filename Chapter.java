public class Chapter {
    String title;
    String text;
    String choice1;
    String choice2;
    Persona character;
    int modifier;
    String end;


    public Chapter (String title, String text, String choice1, String choice2, Persona character, int modifier, String end){
        this.title = title ;
        this.text = text;
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.character = character;
        this.modifier = modifier;
        this.end = end;
    }
    
    public void show(){
        System.out.println(this.title);
        System.out.println(this.text);
        System.out.println(this.choice1);
        System.out.println(this.choice2);
        if (modifier != 0){
            this.character.changeEnergy(modifier);
        System.out.println(this.end);
        }
    }
}

