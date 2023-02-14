import java.io.*;
import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) throws FileNotFoundException {

        String path = System.getProperty("user.dir");
        System.out.println("Current directory: "+path);
        File adjectivesFile = new File(path+"/src/main/resources/adjectives.txt");
        File nounsFile = new File(path+"/src/main/resources/nouns.txt");
        FileInputStream adjIn = new FileInputStream(adjectivesFile);
        FileInputStream nounIn = new FileInputStream(nounsFile);

        String[] adjectives = new String[100];
        String[] nouns = new String[100];

        try (BufferedReader adjReader = new BufferedReader(new InputStreamReader(adjIn)); BufferedReader nounReader = new BufferedReader(new InputStreamReader(nounIn));
        ) {
            for (int i = 0; i < 100; i++) {
                adjectives[i] = adjReader.readLine();
            }
            for (int i = 0; i < 100; i++) {
                nouns[i] = nounReader.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

//        System.out.println(Arrays.toString(adjectives));
//        System.out.println(Arrays.toString(nouns));

        Random rand = new Random();
        int selectionOne = rand.nextInt(100);
        int selectionTwo = rand.nextInt(100);

        System.out.println("Server name: " +adjectives[selectionOne]+"-"+nouns[selectionTwo]);
    }
}
