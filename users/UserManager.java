package users;

public class UserManager {
    static String storedUsername = "azeem";
    static String storedPassword = "123456";

    public static class LoginProcessor {
        public static boolean authenticate(String username, String password) {
            if (storedUsername.equals(username) && storedPassword.equals(password)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
