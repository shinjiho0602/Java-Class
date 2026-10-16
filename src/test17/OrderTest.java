package test17;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderID = 202609013;
        order.customerID = "dgsw";
        order.orderDate = "2026년 9월 1일";
        order.customerName = "홍길동";
        order.productID = "PD0345-12";
        order.adress = "대구광역시 달성군 구지면 창리로 93";
        System.out.println("주문 번호: " + order.orderID);
        System.out.println("주문자 아이디: " + order.customerID);
        System.out.println("주문 날짜: " + order.orderDate);
        System.out.println("주문자 이름: " + order.customerName);
        System.out.println("주문 상품 번호: " + order.productID);
        System.out.println("배송 주소: " + order.adress);
    }
}
