import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTask_1_printHello {
    public static void printHello() {
        System.out.println("Пожалуйста введите число и нажмите Enter" +
                "\nДля заверешения введите: stop");
        int SEVEN = 7;
        Scanner sc = new Scanner(System.in);
        try {
            do {
                if (sc.nextInt() > SEVEN) {
                    System.out.println("Привет");
                } else {
                    System.out.println("Попробуйте ещё раз");
                }
            } while (!sc.nextLine().equals("stop"));
        } catch (InputMismatchException ignored) {
        }
    }
}
