import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class HelloWorldTest {
    @Test
    public void testHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        assertTrue(true); // Add your test logic here
    }

    @Test
    public void testUserDAO() {
        UserDAO userDAO = new UserDAO();
        assertTrue(userDAO.getAllUsers() != null); // Add your test logic here
    }
}