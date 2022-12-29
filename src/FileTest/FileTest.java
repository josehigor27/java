package FileTest;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest {
    public static void main(String[] args) {

        //java.io.File file = new java.io.File("file.txt");
        File file = new File("file.txt");
        try {
           if(!file.exists()){
               boolean isCreated = file.createNewFile();
               System.out.println("Criado "+isCreated);
               System.out.println("Path"  + file.getPath());
               System.out.println("Path Absolut" + file.getAbsolutePath());
               System.out.println("is Directory" + file.isDirectory());
               System.out.println("is Hidden" + file.isHidden());
               System.out.println("last modified " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDate());
           }else{
               boolean isDeleted = file.delete();
               System.out.println("Deletado "+isDeleted);
           }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
