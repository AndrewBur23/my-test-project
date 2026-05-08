import java.io.*;
import java.nio.file.Path;

public class MyFirstFile {
    public static void main(String[] args) {
        File file = Path.of("test.txt").toFile();
        System.out.println("Файл лежит тут: " + file.getAbsolutePath());
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Первая строка\n");
            writer.write("Вторая строка");
            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader(file));
            System.out.println(reader.readLine());
            System.out.println(reader.readLine());
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}