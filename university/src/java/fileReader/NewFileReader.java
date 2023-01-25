package fileReader;

import model.Courses;
import model.SubjectType;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class NewFileReader {
    private static List<Courses> coursesList = new ArrayList<>();
    private static final String FILE_PATH =
            "university/src/resources/szakok.txt";

    public static List<Courses> loadLinesWithExceptionHandling() {
        try {
            readFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File not found exception: " +
                "chack your file path!");
        }
        return null;
}

    private static List<Courses> readFile() throws IOException{



        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader bufferedReader = new BufferedReader
                (fileReader);
        for (String line; (line = bufferedReader.readLine())
                != null;){
           // System.out.println(line);
            String[] parts = line.split(";");
            Courses courses = new Courses(parts[0],
                    parts[1],
                    parts[2],
                    SubjectType.valueOf(parts[3]),
                    strArrToIntAr(parts[4].split("[|]")),
                    Integer.parseInt(parts[5]),
                    parts[6].split("[|]"));
            coursesList.add(courses);
        }
        return coursesList;
}

    private static int[] strArrToIntAr(String[] nums) {
    int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = Integer.parseInt(nums[i]);
        }
    return result;
    }

    public static void readData() {
        System.out.println(Arrays.toString(coursesList.get(8).getSemestersOffered()));
    }

}
