package reference;

public class Student {
    int studentID;
    String studentName;
    Subject korean = new Subject();
    Subject math = new Subject();
    public Student(int studentID, String studentName) {
        this. studentID = studentID;
        this. studentName = studentName;
    }

    public void setKoreanSubject(String subjectName, int score) {
        korean.setSubjectName(subjectName);
        korean.setScorePoint(score);
    }
    public void setmathSubject(String subjectName, int score) {
        math.setSubjectName(subjectName);
        math.setScorePoint(score);
    }

    public void showStudentInfo() {
        System.out.println(studentName + "님의 " + korean.getSubjectName()
                + "과목의 점수는 " + korean.getScorePoint() + "점 이고,"
                + math.getSubjectName() + "과목의 점수는 "
                + math.getScorePoint() + "점 입니다.");
    }
}
