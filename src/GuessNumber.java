import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int usernum = 0;
        int secretnum = random.nextInt(1000) + 1;

        while (usernum != secretnum) {
            System.out.print("Угадайте число от 1 до 1000: ");
            usernum = scanner.nextInt();

            if (usernum > secretnum) {
                System.out.println("Неверно, меньше!");
            } else if (usernum < secretnum) {
                System.out.println("Неверно, больше!");
            } else {
                System.out.println("Вы угадали, верно!");
            }
        }
    }
}