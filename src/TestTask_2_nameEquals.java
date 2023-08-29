import java.util.Scanner;

public class TestTask_2_nameEquals {

    public static void returnMessageForTheEnteredName() {
        System.out.println("Пожалуйста введите имя: Вячеслав");
        Scanner sc = new Scanner(System.in);
        for (; ; ) {
            if (sc.nextLine().equals("Вячеслав")) {
                System.out.println("Привет Вячеслав!");
                return;
            } else {
                System.out.println("Нет такого имени");
            }
        }
    }


}
