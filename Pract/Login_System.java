package Pract;

import java.util.Scanner;

class User {
    private String userId;
    private String password;

    public User(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public boolean validPassword(String pass) {
        return password.equals(pass);
    }
}

public class Login_System {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User("Admin", "1234");
        System.out.println("=== Login System ===");
        System.out.print("Enter Username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Enter Password: ");
        String inputPassword = scanner.nextLine();
        if (inputUsername.equals(user.getUserId()) && user.validPassword(inputPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
