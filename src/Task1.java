import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");

        try {
            int a = scanner.nextInt();

            if (a > 7) {
                System.out.println("Привет");
            } else {
                System.out.println("Веденное число не больше семи");
            }
        } catch (Exception e) {
            System.out.println("Значение переменной не является Integer");
        }
    }
}
