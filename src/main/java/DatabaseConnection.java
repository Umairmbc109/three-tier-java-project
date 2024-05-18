import java.io.IOException;

public class DatabaseConnection {

    public void connect() {
        try {
            // Code that may throw IOException
            // For example:
            throw new IOException("Simulated IOException");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.connect();
    }
}
