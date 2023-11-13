package pl.javastart.task;

class SpecialOffer {
    Product product;
    String description;
    String timePeriod;
    double discount;

    SpecialOffer(final Product product, final String description, final String timePeriod, final double discount) {
        this.product = product;
        this.description = description;
        this.timePeriod = timePeriod;
        this.discount = discount;
    }

    double calculateDiscount() {
        return product.price - (product.price * discount);
    }

    void displayInfo() {
        System.out.printf("Oferta specjalna na produkt %s, opis promocji: %s, czas trwania promocji: %s, " +
            "znizka wynosi %.2f proc, produkt po znizce kosztuje: %.2fzł",  product.name, description, timePeriod,
                discount * 100, calculateDiscount()
        );
    }
}
