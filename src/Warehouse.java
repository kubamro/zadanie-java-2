public class Warehouse {
    public static void main(String[] args) {
        Product product1 = new Product("Zegarek","DKNY","NY6078", 799);
        System.out.println(product1.name + " " + product1.producer + " " + product1.sku + " " + product1.price);

        Product product2 = new Product("Zegarek","Micheal Kors","MK6087", 1099);
        System.out.println(product2.name + " " + product2.producer + " " + product2.sku + " " + product2.price);

    }
}
