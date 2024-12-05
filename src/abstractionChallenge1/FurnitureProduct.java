package abstractionChallenge1;

public class FurnitureProduct extends ProductForSale{
    private String material;
    private String dimensions;

    public FurnitureProduct(String type, double price, String description, String material, String dimensions) {
        super(type, price, description);
        this.material = material;
        this.dimensions = dimensions;
    }


    @Override
    public void showDetails() {
        System.out.printf("This is a %s furniture item. " +
                        "Price: $%.2f. " +
                        "Description: %s. " +
                        "Material: %s. " +
                        "Dimensions: %s.%n",
                getType(), getPrice(), getDescription(), material, dimensions);
    }
}
