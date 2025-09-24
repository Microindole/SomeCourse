package learn.test;

import java.io.File;

public class TextPrintWriter {
    public static void main(String[] args) {
        File file = new File("sss.txt");
        if (file.exists()) {
            System.out.println("File already exits");
            
        }

    }
    
}
