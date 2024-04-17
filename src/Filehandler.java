import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filehandler {
    public void readCostumers(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        scanner.nextLine();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] lineArray = line.split(":");
        }

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