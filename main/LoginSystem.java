import util.PasswordValidator;
import users.UserManager;

public class LoginSystem {
    public static void main(String args[]) {
        java.io.Console console = System.console();

        String username = console.readLine("Enter username: ");
        char[] charPassword = console.readPassword("Enter password: ");

        String password = String.valueOf(charPassword);


        boolean isAuthenticated = UserManager.LoginProcessor.authenticate(username, password);

        if (isAuthenticated) {
            System.out.println("Logged in as " + username);
        } else {
            System.out.println("Wrong Credentials. Login failed");
        }

    }
}
