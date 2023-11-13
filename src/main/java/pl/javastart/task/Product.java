package pl.javastart.task;

class Product {
    String name;
    double price;
    String description;
    Category category;

    Product(final String name, final double price, final String description, final Category category) {
        this(name, price, description);
        this.category = category;
    }

    Product(final String name, final double price, final String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    void displayInfo() {
        System.out.printf("Produkt: %s, cena: %.2f, opis: %s, kategoria: %s, opis kategorii: %s \n",
            name, price, description, category != null ? category.name : "", category != null ? category.description : ""
        );
    }
}
