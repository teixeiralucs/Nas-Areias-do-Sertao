import java.util.HashMap;

public class Main{


    public static void main(String [] args) {

        FileReader reader = new FileReader();
        HashMap<String, Persona> personaMap = reader.personaReader("rsc/characters.txt");
        HashMap<String, Chapter> chapterMap = reader.chapterReader("rsc/chapters.txt", personaMap);

        Chapter rootChapter = chapterMap.get("PRECHAPTER");
        rootChapter.run();  
        }

}