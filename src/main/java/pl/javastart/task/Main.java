package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Category category1 = new Category("Buty", "Najlepsze buty");
        Category category2 = new Category("Kurtki", "Najlepsze kurtki");
        Product product1 = new Product("Buty Nike", 399.99, "Super buty", category1);
        Product product2 = new Product("Buty Adidas", 199.99, "Fajne buty", category1);
        Product product3 = new Product("Kurtka Reebok", 1199.99, "Fajna kurtka", category2);
        Product product4 = new Product("Jeans", 499.99, "Fajne spodnie");
        SpecialOffer specialOffer = new SpecialOffer(product1, "Black weeks", "1.11 - 30.11", 0.2);

        product1.displayInfo();
        product2.displayInfo();
        product3.displayInfo();
        product4.displayInfo();

        specialOffer.displayInfo();
    }
}
