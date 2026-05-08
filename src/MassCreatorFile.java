import java.io.File;
import java.io.IOException;
public class MassCreatorFile {
    public static void main(String[] args) {
        System.out.println("Программа запущена.");
        String[][] structure = new String[5][5];
        for (int i = 0; i < 5; i++) {
            String dirName = "folder_" + i;
            File directory = new File(dirName);
            if (directory.mkdir()) { // создаем папку
                System.out.println("Папка создана: " + dirName);
            }
            for (int j = 0; j < 5; j++) {
                structure[i][j] = dirName + "/file_" + j + ".txt";
                File file = new File(structure[i][j]);
                System.out.println("Проверяю файл: " + structure[i][j]);
                try {
                    if (file.createNewFile()) {
                        System.out.println("Файл создан: " + structure[i][j]);
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
                System.out.println("Успешно.");
            }
        }
    }
}