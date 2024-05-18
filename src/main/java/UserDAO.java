import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private DatabaseConnection databaseConnection;

    public UserDAO() {
        databaseConnection = new DatabaseConnection();
    }

    public List<String> getAllUsers() {
        List<String> users = new ArrayList<>();
        try {
            PreparedStatement statement = databaseConnection.getConnection().prepareStatement("SELECT * FROM users");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                users.add(resultSet.getString("username"));
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving users: " + e.getMessage());
        }
        return users;
    }
}