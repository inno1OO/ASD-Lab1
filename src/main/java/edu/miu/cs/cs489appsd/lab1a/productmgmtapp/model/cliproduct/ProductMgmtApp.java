package edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model.cliproduct;


        import edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model.Product;
        import com.google.gson.Gson;
        import com.google.gson.GsonBuilder;

        import java.util.Arrays;
        import java.util.Comparator;

public class ProductMgmtApp {

    public static void main(String[] args) {
        Product[] products = {
                new Product("001", "Apple", 0.99, 100),
                new Product("002", "Banana", 0.59, 150),
                new Product("003", "Orange", 0.79, 120),
                new Product("004", "Mango", 1.50, 80),
                new Product("005", "Grapes", 2.00, 200)
        };

        printProducts(products);
    }

    public static void printProducts(Product[] products) {
        Arrays.sort(products, Comparator.comparing(Product::getProductName));

        System.out.println("JSON Format:");
        printAsJson(products);

        System.out.println("\nXML Format:");
        printAsXml(products);

        System.out.println("\nCSV Format:");
        printAsCsv(products);
    }

    private static void printAsJson(Product[] products) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(products);
        System.out.println(json);
    }

    private static void printAsXml(Product[] products) {
        System.out.println("<products>");
        for (Product product : products) {
            System.out.println("  <product>");
            System.out.println("    <productId>" + product.getProductId() + "</productId>");
            System.out.println("    <productName>" + product.getProductName() + "</productName>");
            System.out.println("    <unitPrice>" + product.getUnitPrice() + "</unitPrice>");
            System.out.println("    <quantity>" + product.getQuantity() + "</quantity>");
            System.out.println("  </product>");
        }
        System.out.println("</products>");
    }

    private static void printAsCsv(Product[] products) {
        System.out.println("productId,productName,unitPrice,quantity");
        for (Product product : products) {
            System.out.println(product.getProductId() + "," + product.getProductName() + "," + product.getUnitPrice() + "," + product.getQuantity());
        }
    }
}
