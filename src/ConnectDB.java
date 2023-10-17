import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
    static Connection con;
    public static Connection createC() {
        try {
            // load the driver
            Class.forName("com.mysql.jdbc.Driver");

            // creating connection
            String user = "root";
            String pass = "root";
            String url = "jdbc:mysql://localhost:3306/";

            con = DriverManager.getConnection(url, user, pass);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
