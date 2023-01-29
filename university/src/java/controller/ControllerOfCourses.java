package controller;

import fileReader.NewFileReader;
import fileReader.SetupCourses;
import model.Courses;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ControllerOfCourses {

    /**
     1. Olvasd be a fájl tartalmát!
     A tanegységeket rendezd szakok szerint!
     */

    public static void loadLinesWithExceptionHandling() {
        try {
            NewFileReader.readFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File not found exception: " +
                    "check your file path!");
        }
    }

    /**
     2. Írj metódust,
     amely visszaadja (adatszerkezetben) azokat a tanegységeket,
     amelyeknek nincs semmilyen előfeltétele.
     */

    public static void noPreconditionChecker() {
        List<Courses> noPrecondition = new ArrayList<>();
        for (Courses course : SetupCourses.coursesList) {
            readOfPreconditionArr(noPrecondition, course);
        }
    }

    private static void readOfPreconditionArr(List<Courses> list, Courses course) {
        for (String str : course.getCodeOfPreconditionS()) {
            if (str.equals("NULL")) {
                list.add(course);
            }
        }
    }

    /**
     3. Írj metódust, amely két bemeneti paramétert kap:
     egy szakhoz tartozó tanegységek listáját és egy típust,
     és visszaadja (adatszerkezetben) az összes olyan típusú
     tanegységet a bemeneti paraméterként kapott listából.
     */

    public static List<String> listingOfSubjectNames(List<Courses> courses) {
        List<String> subjectNameList = new ArrayList<>();
        for (Courses course : courses) {
            subjectNameList.add(course.getSubjectNAme());
        }
        return subjectNameList;
    }

    /**
     4. Írj metódust, amely visszaadja az összes legtöbb
     előfeltétellel rendelkező tanegységeket
            (az összes tanegység közül, és nem szakonként)!
     Például: A legtöbb előfeltétel,
     amellyel egy tanegység rendelkezik, 5.
     Az összes tanegység között 10 olyan tanegység van,
     amely 5 előfeltétellel rendelkezik.
     Ebben az esetben a metódusodnak össze kell gyűjtenie,
     és vissza kell adnia ezt a 10 tanegységet.
     */

    /**
     5. Írj metódust, amely visszaadja azt a tanegységet
     (vagy tanegységeket),
     ahol a legtöbb egymásra épülő előfeltétel van!
     Egymásra épülő tanegység:
     A tanegység előfeltétele B tanegység
     B tanegység előfeltétele C tanegység
     C tanegység előfeltétele D tanegység
     --- A, B, C, D tanegységek egymásra épülnek
     */
}
