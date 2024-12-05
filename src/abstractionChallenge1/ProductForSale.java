package abstractionChallenge1;

class OrderItem {
    private ProductForSale product;
    private int qty;

    public OrderItem(ProductForSale product, int qty) {
        this.product = product;
        this.qty = qty;
    }

    public ProductForSale getProduct() {
        return product;
    }

    public double getTotalPrice(){
        return product.getSalesPrice(qty);
    }

    public void printOrderItem(){
        product.printPricedItems(qty);
    }
}

public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    protected String getType() {
        return type;
    }

    protected double getPrice() {
        return price;
    }

    protected String getDescription() {
        return description;
    }

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int qty){
        return qty * price;
    }

    public void printPricedItems(int qty){
        System.out.printf("%d x %s - $%.2f%n", qty, type, getSalesPrice(qty));
    }

    public abstract void showDetails();
}
