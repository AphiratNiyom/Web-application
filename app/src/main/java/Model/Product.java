package Model;

public class Product {
    private String name;
    private String category;
    private int price;
    private String imageUrl;

    public Product(String name, String category, int price, String imageUrl) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
