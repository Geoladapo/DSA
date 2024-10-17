package OrderManagement;

public class Main {
    public static void main(String[] args) {

        Order order = new Order("ORD12345");
        order.printOrderDetails();

        Order.Item item1 = order.new Item("ITM1234", "Laptop", 2);
        Order.Item item2 = order.new Item("I002", "Smartphone", 25);
        item1.printItemDetails();
        item2.printItemDetails();
    }
}
