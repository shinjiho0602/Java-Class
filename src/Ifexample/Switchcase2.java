package Ifexample;

public class Switchcase2 {
    public static void main(String[] args) {
        String medal = "Gold";
        String message;
        message = switch (medal){
            case "Gold" -> "금매달입니다.";
            case "Silver" -> "은매달입니다.";
            case "bronze" -> "동매달입니다.";
            default -> "메달이 없습니다.";
        };
        System.out.println(message);
    }
}
