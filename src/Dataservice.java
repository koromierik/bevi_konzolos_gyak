import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class Dataservice {
    public void insertCustomers(ArrayList<Customer> customerList) throws SQLException {

        String user = "bevi";
        String password = "titok";
        String url = "jdbc:mariadb://localhost:3306/bevi";

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "";
    }

    public void insertIncomings(ArrayList<Incoming> incomingList) {

    }

}
