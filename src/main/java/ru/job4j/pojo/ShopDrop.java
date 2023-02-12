    package ru.job4j.pojo;

    public class ShopDrop {
        public static void main(String[] args) {
            Product[] products = new Product[7];
            products[0] = new Product("Oil", 10);
            products[1] = new Product("Egg", 4);
            products[2] = new Product("Milk", 19);
            products[3] = new Product("Fish", 19);
            products[4] = new Product("Fruit", 19);
            products[5] = new Product("Slat", 19);
            products[6] = new Product("Sugar", 0);
            for (int i = 0; i < products.length; i++) {
                Product product = products[i];
                System.out.println(product.getName());
            }
            products[1] = null;
            for (int i = 0; i < products.length; i++) {
                Product product = products[i];
                if (product != null) {
                    System.out.println(product.getName());
                } else {
                    System.out.println("null");
                }
            }
        }
        public static Product[] delete(Product[] products, int index) {
            products[index] = null;
            for (int i = 0; i < products.length -1; i++) {
                if (products[i] == null) {
                    products[i] = products[i + 1];
                    products[i + 1] = null;}

                }

            return products;
        }
    }
