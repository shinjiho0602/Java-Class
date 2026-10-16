package staticdemo;

public class Student {
    public static int serialNum = 1301;

    private int studentID;
    private String StudentName;
    private int grade;
    private String address;

    public Student() {
        serialNum++;
        this.studentID = serialNum;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }
    public String getStudentName() {
        return StudentName;
    }
    public int getStudentID() {
        return studentID;
    }

    public static int getSerialNum() {
        return serialNum;
    }
}
