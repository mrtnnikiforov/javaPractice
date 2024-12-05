package abstractionChallenge1;

public class BookProduct extends ProductForSale{
    private String author;
    private String genre;

    public BookProduct(String type, double price, String description, String author, String genre) {
        super(type, price, description);
        this.author = author;
        this.genre = genre;
    }

    @Override
    public void showDetails() {
        System.out.printf("This is a %s book. " +
                        "Price: $%.2f. " +
                        "Description: %s. " +
                        "Author: %s. " +
                        "Genre: %s.%n",
                getType(), getPrice(), getDescription(), author, genre);
    }

}
