import java.io.*;
import java.nio.file.Path;

public class PasswordCrackerToFile {
    public static void main(String[] args) {
        String targetPassword = "2333";
        File file = Path.of("cracked_password.txt").toFile();
        System.out.println("Файл лежит тут: " + file.getAbsolutePath());


        try {
            for (int i = 0; i <= 9999; i++) {
                String attempt = String.format("%04d", i);

                if (attempt.equals(targetPassword)) {
                    System.out.println("Пароль найден! Записываю в файл...");

                    FileWriter writer = new FileWriter(file);
                    writer.write("Успешный взлом!\n");
                    writer.write("Найденный пароль: " + attempt);
                    writer.close();

                    break;
                }
            }

            System.out.println("Читаем отчет из файла...");
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}