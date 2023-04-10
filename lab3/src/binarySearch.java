import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {

    /**
     * конвертирует строковые значения в массив int
     * @param scanner считываем данные с клавиатуры
     * @return массив чисел
     */
    public  int[] readArrayFromInput(Scanner scanner) {
        System.out.print("Введите количество элементов массива: ");
        int num = scanner.nextInt();
        int[] array = new int[num];

        System.out.print("Введите " + num + " чисел: ");
        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    /**
     *
     * @param array массив в котором ищем элемент
     * @param item элемент для бинарного поиска(который мы ищем)
     * @return идекс элмента в массиве
     */
    public int binarySearch(int[] array, int item) {
        int first = 0;
        int last = array.length - 1;

        while (first <= last) {
            int position = (first + last) / 2;
            if (array[position] == item) {
                return position;
            } else if (array[position] > item) {
                last = position - 1;
            } else {
                first = position + 1;
            }
        }
        return -1;
    }
}

