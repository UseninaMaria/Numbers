import java.util.*;

//Составьте ArrayList из набора чисел 1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4 и произведите над ним следующие действия:
//
//        Отфильтруйте положительные числа.
//        Найдите среди этих положительных чисел четные.
//        Отсортируйте отфильтрованные числа в порядке возрастания.
//        Выведите результат на экран.
public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> filteredList = new ArrayList<>();

        for (Integer n : intList) {
            if (n > 0 && n % 2 == 0) {
                filteredList.add(n);
            }
        }
        filteredList.sort(Comparator.naturalOrder());
        for (Integer n: filteredList) {
            System.out.print(n + " ");
        }
    }
}