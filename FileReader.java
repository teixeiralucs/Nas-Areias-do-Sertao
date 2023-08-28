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
            Scanner FileReader = new Scanner(file, "UTF-8");
            System.out.println ("Escaneando os Personagens");
            while(FileReader.hasNextLine()){
                String line = FileReader.nextLine();
                if(line.equalsIgnoreCase("CHARACTER")){
                    String ID = FileReader.nextLine();
                    String name = FileReader.nextLine();
                    int energy = Integer.parseInt(FileReader.nextLine());
                    Persona character = new Persona(name, energy);
                    personaMap.put(ID, character);
                }
                
            }
            FileReader.close();
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
                Scanner FileReader = new Scanner( file2, "UTF-8");
                System.out.println("Escaneando os Capítulos");
                while(FileReader.hasNextLine()){
                    String line = FileReader.nextLine();
                    if(line.equalsIgnoreCase("CHAPTER")){
                        ArrayList<Choice> choices = new ArrayList<Choice>();
                        String ID = FileReader.nextLine();
                        String Title = FileReader.nextLine();
                        String Name = FileReader.nextLine();
                        String Character = FileReader.nextLine();
                        int Energy = Integer.parseInt(FileReader.nextLine());
                        String End = FileReader.nextLine();
                        String imageline = FileReader.nextLine();
                        
                        if (imageline.equalsIgnoreCase("imagestart")){
                            String image = "";
                            while(!line.equalsIgnoreCase("endimage")){
                                line = FileReader.nextLine();
                                if(line.equalsIgnoreCase("endimage")){
                                    break;
                                }
                                    image += "\n" + line;
                            }
                            ChapterImage chapter = new ChapterImage(Title, Name, choices, personaMap.get(Character), Energy, End, image);
                            chapterMap.put(ID, chapter);
                            
                        }
                        else{
                        Chapter chapter = new Chapter(Title, Name, choices, personaMap.get(Character), Energy, End);
                        chapterMap.put(ID, chapter);    
                        }

                
                    }

                    else if(line.equalsIgnoreCase("CHOICE")){
                        String ID = FileReader.nextLine();
                        String choice = FileReader.nextLine();
                        String IDOut = FileReader.nextLine();
                        chapterMap.get(ID).setChoices(new Choice(choice, chapterMap.get(IDOut)));
                    }
                }
                FileReader.close();
            }
            catch(FileNotFoundException a){
            System.out.println ("Não foi possível encontrar o arquivo neste caminho");
        }
        return chapterMap;
    }

}
