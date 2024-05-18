import java.sql.Connection;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        UserDAO userDAO = new UserDAO(dbConnection);

        // Assuming getAllUsers() method exists in UserDAO and returns a List<User>
        List<User> users = userDAO.getAllUsers(); // Call the getAllUsers() method
    }
}

