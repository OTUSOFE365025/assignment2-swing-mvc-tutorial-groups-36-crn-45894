import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Model {
    private static final ArrayList<Product> productFileList = new ArrayList<>();
    private final ArrayList<Product> scannedProductList = new ArrayList<>();
    private String firstname;
    private String lastname;

    public Model(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;

        try (BufferedReader br = new BufferedReader(new FileReader("SwingMVC/products_file"))) {
            if (br.read() >= 65) {
                br.readLine();
            } else {
                String line;
                while ((line = br.readLine()) != null) {

                    if (line.trim().isEmpty()) continue;

                    String[] parts = line.split("\\s+");

                    if (parts.length < 3) {
                        System.err.println("Skipping invalid line: " + line);
                        continue;
                    }
                    try {
                        int upcCode = Integer.parseInt(parts[0].trim());
                        String productName = parts[1].trim();
                        double price = Double.parseDouble(parts[2].replace("$", ""));

                        productFileList.add(new Product(upcCode, productName, price));

                    } catch (NumberFormatException e) {
                        System.err.println("Error parsing upc code or price on line: " + line);
                    }
                }
            }
        }
        catch(IOException e){
            System.err.println(e.getMessage());
        }

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void addByUPC(int upc) {
        for (Product product : productFileList) {
            if (product.getUPC() == upc) {
                scannedProductList.add(product);
            }
            else{
                System.err.println("Product with UPC " + upc + " does not exist in file");
                break;
            }
        }
    }

    public double getSubtotal() {
        double subtotal = 0;
        for (Product product : scannedProductList) {
            subtotal += product.getPrice();
        }
        return subtotal;
    }

    //For testing
    public int getTotalNumberProducts() {
        return productFileList.size();
    }
}
