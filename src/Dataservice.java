import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Dataservice {
    public void insertCustomers(ArrayList<Customer> customerList) throws SQLException {

        String user = "bevi";
        String password = "titok";
        String url = "jdbc:mariadb://localhost:3306/bevi";

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = """
                insert into customers(id,name,email)

                values(?,?,?)

                """;

        for (Customer customer : customerList) {

            PreparedStatement ps = connection.prepareStatement(sql); /// itt vannak egyesítve
            ps.setInt(1, customer.id);
            ps.setString(2, customer.name);
            ps.setString(3, customer.email);
        }

    }

    public void insertIncomings(ArrayList<Incoming> incomingList) {

    }

}
