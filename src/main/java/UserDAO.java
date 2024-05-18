import java.sql.Connection; // Import Connection class

public class UserDAO {
    private Connection connection; // Declare Connection object

    public UserDAO(DatabaseConnection databaseConnection) { // Constructor accepting DatabaseConnection object
        this.connection = databaseConnection.getConnection(); // Assuming getConnection() method exists in DatabaseConnection
    }

    // Define other methods as needed
}

