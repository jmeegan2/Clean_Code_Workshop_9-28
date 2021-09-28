import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class OriginalMain {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./src/input.txt");
        Scanner input_file = new Scanner(file);

        ArrayList<String> list = new ArrayList<>();
        while(input_file.hasNextLine()) {
            String word = input_file.nextLine();

            if (word.charAt(0) == 'A' || word.charAt(0) == 'E' || word.charAt(0) == 'I' || word.charAt(0) == 'O' || word.charAt(0) == 'U') {
              list.add(word);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).charAt(0) == 'A') System.out.println(list.get(i));
        }
        System.out.print("\n");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).charAt(0) == 'E') System.out.println(list.get(i));
        }
        System.out.print("\n");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).charAt(0) == 'I') System.out.println(list.get(i));
        }
        System.out.print("\n");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).charAt(0) == 'O') System.out.println(list.get(i));
        }
        System.out.print("\n");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).charAt(0) == 'U') System.out.println(list.get(i));
        }
        System.out.print("\n");
    }
}
