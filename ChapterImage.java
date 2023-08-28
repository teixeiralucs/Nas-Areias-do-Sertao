import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ChapterImage extends Chapter{
    private String image;
    public ChapterImage (String title, String text, ArrayList<Choice> choices, Persona character,
    int modifier,String end, String image){
    super(title, text, choices, character, modifier, end);
    this.image = image;
}

    public ChapterImage(Scanner CapterScan, HashMap<String, Persona> personaMap, Scanner FileReader){
        super(CapterScan, personaMap, FileReader);
        this.ChapterScan = CapterScan;
        this.ChapterReader(personaMap, FileReader);
}
@Override
protected void ChapterReader(HashMap<String, Persona> personaMap, Scanner FileReader){
    super.ChapterReader(personaMap, FileReader);
    FileReader.nextLine();
    String line = FileReader.nextLine();
    this.image = "";
    while(!line.equalsIgnoreCase("endimage")){
        this.image += line + "\n";
        line = FileReader.nextLine();
    }
}
public void ImageReader(Scanner FileReader){
    String line = FileReader.nextLine();
    while(!line.equalsIgnoreCase("endimage")){
        this.image += line + "\n";
        line = FileReader.nextLine();
        }
    }
    @Override
    public void show(){
        System.out.println(this.text);
        System.out.println(this.image);

        if (modifier != 0){
            this.character.changeEnergy(modifier);}
    }
    @Override
    public void run(){
        show();
        choose();
}
}
