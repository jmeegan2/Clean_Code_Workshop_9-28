import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;


public class NewMain {
    public static void main(String[] args) throws FileNotFoundException {
    WordList test = new WordList("./src/input.txt");
        }
    }
class WordList {
    private ArrayList<String> raw_list;
    private Scanner input_file;
    private ArrayList<String> word_list;

    public WordList(String file_path) throws FileNotFoundException {
        raw_list = new ArrayList<>();
        input_file = new Scanner(new File(file_path));
        word_list = new ArrayList<>();
        parse_into_struct();
    }

    private void parse_into_struct() {
        while(input_file.hasNextLine()){
            raw_list.add(input_file.nextLine());
        }
    }

    public void parse_input_stream(char token){
        for(int i = 0; i < raw_list.size(); i++)
            if (raw_list.get(i).charAt(0) == token)
                word_list.add(raw_list.get(i));
    }



public void print_list() {
    System.out.println(word_list);
}
}