package abstractionChallenge1;

public class ElectronicsProduct extends  ProductForSale{
    private String brand;
    private int warrantyPeriod;

    public ElectronicsProduct(String type, double price, String description, String brand, int warrantyPeriod) {
        super(type, price, description);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void showDetails() {
        System.out.printf("This is a %s product. " +
                        "Price: $%.2f. " +
                        "Description: %s. " +
                        "Brand: %s. " +
                        "Warranty period: %d months.%n",
                getType(), getPrice(), getDescription(), brand, warrantyPeriod);
    }



}
