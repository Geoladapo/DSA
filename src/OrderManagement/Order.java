package OrderManagement;

public class Order {
    private String orderID;

    public Order(String orderID) {
        this.orderID = orderID;
    }

    public void printOrderDetails() {
        System.out.println("Order ID: " + orderID);
    }

    public static class Item {
        private String itemID;
        private String itemName;
        private int quantity;

        public Item(String itemID, String itemName, int quantity) {
            this.itemID = itemID;
            this.itemName = itemName;
            this.quantity = quantity;
        }

        public void printItemDetails() {
            System.out.println("===================================");
            System.out.println("           ITEM DETAILS            ");
            System.out.println("===================================");
            System.out.println("Item ID:      " + itemID);
            System.out.println("Item Name:    " + itemName);
            System.out.println("Quantity:     " + quantity);
            System.out.println("===================================");
        }
    }
}
