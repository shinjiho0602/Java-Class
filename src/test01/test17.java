package test01;

public class test17 {
    public static void main(String[] args) {
        String[] cafeMenu = {"Americano","CaffeLate","MilkTea","IceCream","GreenTea"};

        cafeMenu[1] = "VanilaLate";

        for (int i = 0; i < cafeMenu.length;i++) {
            System.out.print(cafeMenu[i]+" ");
        }
    }
}
