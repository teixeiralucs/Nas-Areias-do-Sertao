import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FileReader {
    HashMap<String, Persona> personaReader(String path){
        HashMap<String, Persona> personaMap = new HashMap<String, Persona>();
        File file = new File(path);
        try {
            Scanner reader = new Scanner(file, "UTF-8");
            System.out.println ("Escaneando os Personagens");
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                if(line.equalsIgnoreCase("CHARACTER")){
                    String ID = reader.nextLine();
                    String name = reader.nextLine();
                    int energy = Integer.parseInt(reader.nextLine());
                    Persona character = new Persona(name, energy);
                    personaMap.put(ID, character);
                }
                
            }
            reader.close();
        }
        catch(FileNotFoundException a){
            System.out.println ("Não foi possível encontrar o arquivo neste caminho");
        }
        return personaMap;
    }
        HashMap<String, Chapter> chapterReader(String path, HashMap<String, Persona> personaMap){
            HashMap<String, Chapter> chapterMap = new HashMap<String, Chapter>();
            File file2 = new File(path);
            try{
                Scanner reader = new Scanner( file2, "UTF-8");
                System.out.println("Escaneando os Capítulos");
                while(reader.hasNextLine()){
                    String line = reader.nextLine();
                    if(line.equalsIgnoreCase("CHAPTER")){
                        ArrayList<Choice> choices = new ArrayList<Choice>();
                        String ID = reader.nextLine();
                        String Title = reader.nextLine();
                        String Name = reader.nextLine();
                        String Character = reader.nextLine();
                        int Energy = Integer.parseInt(reader.nextLine());
                        String End = reader.nextLine();

                        Chapter chapter = new Chapter(Title, Name, choices, personaMap.get(Character), Energy, End);
                        chapterMap.put(ID, chapter);
                
                    }
                    else if(line.equalsIgnoreCase("CHOICE")){
                        String ID = reader.nextLine();
                        String choice = reader.nextLine();
                        String IDOut = reader.nextLine();
                        chapterMap.get(ID).setChoices(new Choice(choice, chapterMap.get(IDOut)));
                    }
                }
                reader.close();
            }
            catch(FileNotFoundException a){
            System.out.println ("Não foi possível encontrar o arquivo neste caminho");
        }
        return chapterMap;
    }

}
