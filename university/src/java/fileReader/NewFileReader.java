package fileReader;

import model.Courses;

import java.io.*;
import java.util.List;

public class NewFileReader {

    private static final String FILE_PATH =
            "university/src/resources/szakok.txt";

    public static void readFile() throws IOException{
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader bufferedReader = new BufferedReader
                (fileReader);
        for (String line; (line = bufferedReader.readLine())
                != null;){
            SetupCourses.setupLine(line);

        }
    }
}
