package FileTest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args){
        File file = new File("file.txt");

        try (FileWriter writer = new FileWriter(file)){
            writer.write("Teste de manipulção de arquivos");
            writer.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
