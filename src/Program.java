public class Program {
    public static void main(String[] args) {
        Product product1 = new Product("Milka", "Coś słodkiego", 8, "Słodkie");
        Product product2 = new Product("Ser", "Coś do kanapki", 4, "Nabiał");


        ProductBruttoPriceCalculator taxCalculator = new ProductBruttoPriceCalculator();

        System.out.println("Cenna brutto produktu 1: " + taxCalculator.calculateProductPrice(product1));
        System.out.println("Cenna brutoo produktu 2: " + taxCalculator.calculateProductPrice(product2));
    }
}
