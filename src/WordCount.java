import java.io.File;
import java.util.Scanner;

public class WordCount {
    public static void main(String [] args) throws Exception{
        File file = new File("A tale of two cities.txt");
        Scanner scanner = new Scanner(file);
        int wordCount = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            wordCount += line.split(" ").length;
        }
        System.out.println("The number of words is "+wordCount);
    }

}
