package service;

import dataaccess.UserRepository;

public class UserService {
    private UserRepository userRepository;

    public UserService() {
        // Initialize userRepository (Dependency Injection or any other method)
        this.userRepository = new UserRepository(); // Example: Direct instantiation
    }

    // Example method: Create a user
    public void createUser(String username) {
        // Business logic to create a user
        userRepository.saveUser(username);
    }
}
