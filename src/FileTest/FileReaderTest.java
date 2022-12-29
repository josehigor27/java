package FileTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader reader = new FileReader(file)){
            //o método read() da classe FileReader  retorna o código ASC II do primeiro caractere encontrado no arquivo;
//            char [] in = new char[10];

//            int size = reader.read(in);
//            for (char c:in){
//                System.out.print(c);
//            }
            int i;
            while((i = reader.read())!= -1){
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
