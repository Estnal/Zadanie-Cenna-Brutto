public class ProductBruttoPriceCalculator {
    public double calculateProductPrice(Product product) {
        double vatPrice;

        switch (product.getCategory()) {
            case "Słodkie":
                vatPrice = 0.18;
                break;
            case "Nabiał":
                vatPrice = 0.24;
                break;
            default:
                vatPrice = 0.00;

        }
        return product.getPrice() * (1 + vatPrice);

    }

}
