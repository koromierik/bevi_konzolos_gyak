import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Filehandler {
    public ArrayList<Customer> readCostumers(String filename) throws FileNotFoundException {
        ArrayList<Customer> customerList = new ArrayList<>();
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        scanner.nextLine();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] lineArray = line.split(":");
            Customer customer = new Customer();
            customer.id = Integer.parseInt(lineArray[0]);
            customer.name = lineArray[1];
            customer.email = lineArray[2];

            customerList.add(customer);
        }
        return customerList;
    }

    public void readIncomings(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        scanner.nextLine();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] lineArray = line.split(":");

        }
    }

}