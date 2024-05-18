// DatabaseConnection.java
public class DatabaseConnection {
    public Connection getConnection() {
        // Implementation to get a connection object
        return connection;
    }
}

// UserDAO.java
public class UserDAO {
    private DatabaseConnection databaseConnection;

    public UserDAO(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    public void someMethod() {
        Connection connection = databaseConnection.getConnection();
        // Use the connection object as needed
    }
}

