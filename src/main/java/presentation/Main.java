package presentation;

import service.UserService;

public class Main {
    public static void main(String[] args) {
        // Instantiate UserService
        UserService userService = new UserService();

        // Example: Call a method from the service layer
        String username = "john";
        userService.createUser(username);
    }
}
