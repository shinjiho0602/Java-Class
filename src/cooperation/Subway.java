package cooperation;

public class Subway {
    private int lineNumber;
    private int passengerCount;
    private int money;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void takePerson() {
        money += 850;
        passengerCount++;
    }

    public void showInfo() {
        System.out.println("지하철의 " + lineNumber + "호 승객은"
                + passengerCount + "명이고, 수입은 "
                + money + "입니다.");
    }
}
