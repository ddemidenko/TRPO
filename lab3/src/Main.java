
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        binarySearch binary = new binarySearch();
        try (Scanner scanner = new Scanner(System.in)) {
            int[] array = binary.readArrayFromInput(scanner);
            Arrays.sort(array);

            System.out.print("Введите элемент для бинарного поиска: ");
            int item = scanner.nextInt();

            int position = binary.binarySearch(array, item);
            if (position != -1) {
                System.out.println(item + " является " + (position + 1) + " элементом в массиве");
            } else {
                System.out.println("Элемент не найден в массиве.");
            }
        }
    }

}