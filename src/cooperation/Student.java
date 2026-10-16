package cooperation;

public class Student {
    private String studentName;
    private int grade;
    private int money;

    public Student(String name, int money) {
        this.money = money;
        this.studentName = name;
    }

    public void takeBus(Bus bus) {
        bus.takePerson();
        money -= 1100;
    }

    public void takeSubway(Subway subway) {
        subway.takePerson();
        money -= 850;
    }

    public void showinfo() {
        System.out.println(studentName + "님의 남은 돈은" + money + "원 입니다");
    }
}
