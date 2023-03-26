import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длинну массива:");
        try {
            int lengthArr = scanner.nextInt();

            if (lengthArr < 0) {
                System.out.println("Массив не может иметь отрицательную длину");
            } else if (lengthArr == 0) {
                System.out.println("нет данных для отображения");
            } else {

                int[] arr = new int[lengthArr];

                for (int i = 0; i < arr.length; i++) {
                    System.out.println("Введите значения элемента массива " + i + ": ");
                    arr[i] = scanner.nextInt();
                }

                System.out.println("Элементы массива кратные 3:");

                for (int j : arr) {
                    if (j % 3 == 0) {
                        System.out.println(j + ", ");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Значение переменной не является Integer");
        }
    }
}