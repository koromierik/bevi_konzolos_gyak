import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("filek adatbázisba");
        Filehandler filehandler = new Filehandler();
        DataService service = new DataService();
        // filehandler.readCostumers(args[0]);

        ArrayList<Customer> customerList = filehandler.readCostumers(args[0]);
        ArrayList<Incoming> incomingList = filehandler.readIncomings(args[1]);

        // for (Incoming incoming : incomingList) {
        // System.out.println(incoming.date);
        // }

        service.insertCustomers(customerList);

        service.insertIncomings(incomingList);
    }
}