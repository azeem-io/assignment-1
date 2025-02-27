package util;

public class PasswordValidator {
    public class Rules {
        public boolean isValid(String password) {
            return password != null && !password.isEmpty();
        }
    }
}
