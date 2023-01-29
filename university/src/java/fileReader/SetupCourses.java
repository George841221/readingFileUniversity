package fileReader;

import model.Courses;
import model.SubjectType;

import java.util.ArrayList;
import java.util.List;

public class SetupCourses {
    public static final List<Courses> coursesList = new ArrayList<>();

    public static void setupLine(String line){
        String[] parts = line.split(";");
        Courses courses = new Courses(parts[0],
                parts[1],
                parts[2],
                SubjectType.valueOf(parts[3]),
                strArrToIntArr(parts[4].split("[|]")),
                Integer.parseInt(parts[5]),
                parts[6].split("[|]"));
        coursesList.add(courses);
    }

    private static int[] strArrToIntArr(String[] strArr) {
        int[] result = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            result[i] = Integer.parseInt(strArr[i]);
        }
        return result;
    }
}
