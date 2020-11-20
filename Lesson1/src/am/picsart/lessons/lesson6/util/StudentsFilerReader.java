package am.picsart.lessons.lesson6.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StudentsFilerReader {

    public static String readFile(String path) throws IOException {
        StringBuilder builder;
        File file = new File(path);

        if (file.exists() && file.isFile()) {
            FileReader fileReader = new FileReader(file);

            builder = new StringBuilder();
            int read;
            while ((read = fileReader.read()) != -1) {
                builder.append((char) read);
            }

            return builder.toString();
        } else {
            System.err.println("Invalid path to file : " + path);
            System.exit(2);
            return "";
        }
    }

}
