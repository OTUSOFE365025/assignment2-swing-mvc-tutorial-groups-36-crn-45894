public class MySwingMVCApp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Assemble all the pieces of the MVC
        Model m = new Model("Cashier", "Name");
        View v = new View("MVC Design With Simple Cash Register");
        Controller c = new Controller(m, v);

        // create scanner
        FileScanner Filescanner = new FileScanner(c);

        c.initController();
    }
}
