public class Main {
    public static void main(String[] args) {
        Order order = new Order(100,100,TradeType.BUY);
        int a = (int)order.getPrice();
    }
}
