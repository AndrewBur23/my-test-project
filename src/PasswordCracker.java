public class PasswordCracker {
    public static void main(String[] args) {
        String password = "2333";
        for (int i = 0; i <= 9999; i++) {
            String attempt = String.format("%04d", i);
            if (attempt.equals(password)) {
                System.out.println("Пароль найден: " + attempt);
                break;
            }
        }
    }
}