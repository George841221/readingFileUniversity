package model;

public class Courses {

    private String courseName;          //szak megnevezése
    private String subjectCode;         //tanegység kódja
    private String subjectNAme;         //tanegység megnevezése
    private SubjectType subjectType;      // Values: K - kollokvium, G - gyakorlat, V - vizsga, EF - egyéni felkészülés
    private int[] semestersOffered;         // Separator: '|', ajánlott félév
    private int requiredCredits;            // Kredit
    private String[] codeOfPreconditionS;   // Separator: '|', gyenge előfeltétel: (*), előfeltételek kódja (-i)

    public Courses(String courseName, String subjectCode, String subjectNAme, SubjectType subjectType,
                   int[] semestersOffered, int requiredCredits, String[] codeOfPreconditions) {
        this.courseName = courseName;
        this.subjectCode = subjectCode;
        this.subjectNAme = subjectNAme;
        this.subjectType = subjectType;
        this.semestersOffered = semestersOffered;
        this.requiredCredits = requiredCredits;
        this.codeOfPreconditionS = codeOfPreconditions;
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