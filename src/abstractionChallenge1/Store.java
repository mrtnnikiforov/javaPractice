package abstractionChallenge1;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private static List<OrderItem> orderItems = new ArrayList<>();

    public static void addItemsToOrder(OrderItem item){
        orderItems.add(item);
    }

    public static void printOrderedItems(){
        for (var item : orderItems){
            item.printOrderItem();
        }
    }

    public static void listProducts(){
        for (var item : orderItems){
            System.out.println("-".repeat(30));
            item.getProduct().showDetails();
        }
    }


    public static void main(String[] args) {
        ProductForSale laptop = new ElectronicsProduct("Laptop", 1200.0, "High-end gaming laptop", "Alienware", 24);
        ProductForSale book = new BookProduct("Book", 15.0, "Fiction novel", "George Orwell", "Dystopian");
        ProductForSale chair = new FurnitureProduct("Chair", 85.0, "Comfortable office chair", "Leather", "120x60x60 cm");

        OrderItem orderItem1 = new OrderItem(laptop, 2);
        OrderItem orderItem2 = new OrderItem(book, 5);
        OrderItem orderItem3 = new OrderItem(chair, 1);

        addItemsToOrder(orderItem1);
        addItemsToOrder(orderItem2);
        addItemsToOrder(orderItem3);

        printOrderedItems();
        double total = 0;
        for (var item : orderItems) {
            total += item.getTotalPrice();
        }
        listProducts();
        System.out.println("Total Order Price: $" + total);
    }
}
