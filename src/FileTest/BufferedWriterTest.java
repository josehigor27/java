package FileTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
    public static void main(String[] args) {
        File file = new File("file.txt");

        //a BufferedWriter recebe no construtor um FileWriter
        try(BufferedWriter bWriter = new BufferedWriter(new FileWriter(file,true))){
            bWriter.newLine();
            bWriter.write("Teste de BufferedWriter/ ");
            bWriter.flush();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
