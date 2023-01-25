import fileReader.NewFileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class TestUniversity {

    public static void main(String[] args){

         final String filePath = "src/resources/szakok.txt";

         NewFileReader.loadLinesWithExceptionHandling();

        NewFileReader.readData();

    }
}
