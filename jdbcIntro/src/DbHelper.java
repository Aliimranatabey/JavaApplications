import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    static String userName="root";
    static String password="1234";
    static String dbUrl="jdbc:mysql://localhost:3306/world";

    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbUrl,userName,password);

    }

    public void showErrorMessage(SQLException exception){
        System.out.println("Error : "+exception.getMessage());
        System.out.println("Error Code : "+exception.getErrorCode());
    }
}
