package model;

public class Courses {

    private String courseName;          //szak megnevezése
    private String subjectCode;         //tanegység kódja
    private String subjectNAme;         //tanegység megnevezése
    private SubjectType subjectType;      // Values: K - kollokvium, G - gyakorlat, V - vizsga, EF - egyéni felkészülés
    private int[] semestersOffered;         // Separator: '|'
    private int requiredCredits;
    private String[] codeOfPreconditionS;   // Separator: '|'

    /*public Courses(String courseName, String subjectCode,
                   String subjectNAme, SubjectType subjectType,
                   int[] semestersOffered, int requiredCredits, String[] split) {
        this.courseName = courseName;
        this.subjectCode = subjectCode;
        this.subjectNAme = subjectNAme;
        this.subjectType = subjectType;
        this.semestersOffered = semestersOffered;
        this.requiredCredits = requiredCredits;
        codeOfPreconditionS = null;
    }*/

    public Courses(int[] semestersOffered) {
        this.semestersOffered = semestersOffered;
    }

    public Courses(String courseName, String subjectCode, String subjectNAme, SubjectType subjectType,
                   int[] semestersOffered, int requiredCredits, String[] codeOfPreconditionS) {
        this.courseName = courseName;
        this.subjectCode = subjectCode;
        this.subjectNAme = subjectNAme;
        this.subjectType = subjectType;
        this.semestersOffered = semestersOffered;
        this.requiredCredits = requiredCredits;
        this.codeOfPreconditionS = codeOfPreconditionS;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectNAme() {
        return subjectNAme;
    }

    public SubjectType getSubjectType() {
        return subjectType;
    }

    public int[] getSemestersOffered() {
        return semestersOffered;
    }

    public int getRequiredCredits() {
        return requiredCredits;
    }

    public String[] getCodeOfPreconditionS() {
        return codeOfPreconditionS;
    }
}