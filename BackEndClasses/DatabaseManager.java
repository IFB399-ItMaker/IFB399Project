import java.sql.*;

public class DatabaseManager {
    private static final String GET_USER = "SELECT * FROM Users WHERE userName = ?";
    private static final String GET_PASSWORD = "SELECT password FROM Users WHERE userName = ?";

    private PreparedStatement getUser;
    private PreparedStatement getPassword;

    private Connection connection;


}