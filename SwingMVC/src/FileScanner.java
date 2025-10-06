// This window emulates the scanning of an item. Every time the button is pressed
// it will send a notification of a UPC code

import java.util.Random;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FileScanner {
    // FileScanner uses Swing framework to create a UPC code
    private JFrame frame;
    private JPanel scannerPanel;
    private JButton scanButton;
    private static final ArrayList<Integer> upcs = new ArrayList<>();

    public FileScanner() {
        //Creating File for reading
        File productFile = new File("SwingMVC/products_file");
        try (Scanner productFileScanner = new Scanner(productFile)) {
            //Skipping header line if there is one
            if (!productFileScanner.hasNextInt()) {
                productFileScanner.nextLine();
            }

            //Processing data file
            while (productFileScanner.hasNextLine()) {
                String line = productFileScanner.nextLine();
                try (Scanner lineScanner = new Scanner(line)) {
                    if (lineScanner.hasNextInt()) {
                        int upc = lineScanner.nextInt();
                        upcs.add(upc);
                    }
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("File: " + productFile.getName() + " does not exist");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        frame = new JFrame("FileScanner");
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 100);
        frame.setLocation(300, 50);
        frame.setVisible(true);

        // Create UI elements
        scanButton = new JButton("Scan");
        scannerPanel = new JPanel();

        // Add UI element to frame
        scannerPanel.add(scanButton);
        frame.getContentPane().add(scannerPanel);

        scanButton.addActionListener(e -> generateUPC());
    }

    private int generateUPC() {
        if (!upcs.isEmpty()) {
            int upcListSize = upcs.size();
            Random rand = new Random();
            int randomIndex = rand.nextInt(upcListSize);

            int upcNumber = upcs.get(randomIndex);
            System.out.println("Random upc number: " + upcNumber);
            return upcNumber;
        } else {
            System.out.println("The list of products is empty.");
            return -1;
        }
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JPanel getScannerPanel() {
        return scannerPanel;
    }

    public void setScannerPanel(JPanel scannerPanel) {
        this.scannerPanel = scannerPanel;
    }

    public JButton getScanButton() {
        return scanButton;
    }

    public void setScanButton(JButton scanButton) {
        this.scanButton = scanButton;
    }
}
