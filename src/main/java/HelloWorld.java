import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        UserDAO userDAO = new UserDAO(dbConnection);

        // Assuming getAllUsers() returns a List<User>
        List<User> users = userDAO.getAllUsers(); // Call the getAllUsers() method

        // Print or process the list of users
        for (User user : users) {
            System.out.println(user.getName()); // Example: Assuming User has a getName() method
        }
    }
}

