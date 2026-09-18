package reference;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(1001,"김도현");

        studentLee.setKoreanSubject("국어",100);
        studentLee.setmathSubject("수학",99);

        Student studentPark = new Student(1002,"박병일");

        studentPark.setKoreanSubject("국어",98);
        studentPark.setmathSubject("수학",97);

        studentLee.showStudentInfo();
        studentPark.showStudentInfo();
    }
}
