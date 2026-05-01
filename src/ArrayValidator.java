public class ArrayValidator {
    public static void main(String[] args) {
        int[] array = {3, 4, 2, 23, 33, -34};
        int totalSum = 0;
        for (int i = 0; i <= array.length; i++) {
            try {
                if (i == array.length) {
                    throw new ArrayIndexOutOfBoundsException("элемент c индексом " + i + " (не существует).");
                }
                if (array[i] < 0) {
                    throw new IllegalArgumentException("элемент под индексом " + array[i] + " (отрицательный).");
                }

                totalSum += array[i];
                System.out.println("Прибавили " + array[i]);

            } catch (IllegalArgumentException e) {
                System.err.println("Поймали " + e.getMessage());
                System.err.println("Пропускаем его и считаем дальше...");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Поймали " + e.getMessage());
                System.err.println("Пропускаем его и считаем дальше...");
            }
        }
        System.out.println("Итоговая сумма: " + totalSum);

    }
}
