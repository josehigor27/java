package FileTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

    public static void main(String[] args) {
        File file = new File("file.txt");
        try(BufferedReader bReader = new BufferedReader(new FileReader(file))){
            String line;
            while ((line=bReader.readLine())!=null){
                System.out.println(line);
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
