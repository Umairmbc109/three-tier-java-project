public class HelloWorld {
    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        UserDAO userDAO = new UserDAO(dbConnection); // Pass DatabaseConnection object to UserDAO constructor

        // Assuming getAllUsers() method exists in UserDAO
        userDAO.getAllUsers(); // Call the getAllUsers() method
    }
}

