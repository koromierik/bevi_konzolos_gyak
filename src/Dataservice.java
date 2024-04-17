import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class DataService {
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

            ps.execute();
        }
        connection.close();
    }

    public void insertIncomings(ArrayList<Incoming> incomingList) {

        String user = "bevi";
        String password = "titok";
        String url = "jdbc:mariadb://localhost:3306/bevi";

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = """
                insert into customers(id,total,edate,source,customerId)

                values(?,?,?,?,?)

                """;

        for (Incoming incoming : incomingList) {

            PreparedStatement ps = connection.prepareStatement(sql); /// itt vannak egyesítve

            ps.setInt(1, incoming.id);
            ps.setDouble(2, incoming.total);
            ps.setString(3, incoming.date);
            ps.setString(4, incoming.source);
            ps.setInt(5, incoming.customerId);

            ps.execute();
        }
        connection.close();
    }
}
}