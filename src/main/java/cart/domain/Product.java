package cart.domain;

public class Product {
    private final Long id;
    private final Name name;
    private final ImageUrl imageUrl;
    private final Price price;

    private Product(Long id, Name name, ImageUrl imageUrl, Price price) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public Name getName() {
        return name;
    }

    public ImageUrl getImageUrl() {
        return imageUrl;
    }

    public Price getPrice() {
        return price;
    }

    public static class Builder {
        private Long id;
        private Name name;
        private ImageUrl imageUrl;
        private Price price;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(Name name) {
            this.name = name;
            return this;
        }

        public Builder imageUrl(ImageUrl imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Builder price(Price price) {
            this.price = price;
            return this;
        }

        public Product build() {
            return new Product(id, name, imageUrl, price);
        }
    }
}
