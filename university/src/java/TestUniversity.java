import controller.ControllerOfCourses;
import fileReader.SetupCourses;

public class TestUniversity {

    public static void main(String[] args){
        ControllerOfCourses.loadLinesWithExceptionHandling();
        ControllerOfCourses.noPreconditionChecker();
        System.out.print(ControllerOfCourses.listingOfSubjectNames(SetupCourses.coursesList));
    }
}
