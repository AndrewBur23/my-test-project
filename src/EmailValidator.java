public class EmailValidator {
    public static void main(String[] args) {
        String email = "javaexception@gmail.com";
        try {
            if (!email.contains("@")) {
                throw new IllegalArgumentException("Ошибка! Отсутствует символ @ ");
            }
            String[] parts = email.split("@");
            String login = parts[0];
            String secondpart = parts[1];
            if (login.length() <= 2 ) {
                throw new IllegalArgumentException("Ошибка! логин слишком короткий (нужно > 2 символов)");
            }
            if (!login.matches("[a-zA-Z0-9]+")) {
                throw new IllegalArgumentException("Ошибка! в логине нельзя использовать спецсимволы");
            }
            if (!secondpart.contains(".")) {
                throw new IllegalArgumentException("Ошибка! в домене нет точки");
            }
            String[] ndparts = secondpart.split("\\.");
            String pochta = ndparts[0];
            String domen = ndparts[1];
            if (!pochta.contains("mail")) {
                throw new IllegalArgumentException("Ошибка! В названии почты должно быть слово mail");
            }
            System.out.println("Все отлично! Логин: " + login + ", Почта: " + pochta + ", Домен: " + domen );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
