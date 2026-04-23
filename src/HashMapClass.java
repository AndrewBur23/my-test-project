import java.util.*;

public class HashMapClass {
    public static void main(String[] args) {
        String text = "Я учу java, я люблю java.";
        text = text.toLowerCase().replaceAll("[^а-яА-Яa-zA-Z\\s]", "");
        String[] words = text.trim().split("\\s+");// Обрезали лишние пробелы и разрезали на слова

        Map<String, Integer> map = new TreeMap<>() ; // Создали пустую таблицу

        for (String w : words) {
            map.merge(w, 1, Integer::sum); // Положили слово и прибавили +1
        }

        for (var entry : map.entrySet()) {
            System.out.println( "'" + entry.getKey() + "'" + " встретилось " + entry.getValue() + " раз(-а)");
        }
    }
}

