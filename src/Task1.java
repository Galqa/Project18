
/*
 * Створити список та заповнити рандомними числами 10 осередків,
 * потрібно вивести суму квадратів усіх елементів списку.
 * Ми використовуємо метод map() для зведення квадрат кожного елемента,
 * а потім застосовуємо метод reduce() для згортки всіх елементів в одне число.
 */


import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@FunctionalInterface
interface Square {
    int calculate(int x);
}

class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = random.ints(10, 1, 10000).boxed().collect(Collectors.toList());

        Square square = (x) -> x * x;

        int sum = list.stream()
                .mapToInt(square::calculate)
                .reduce(0, Integer::sum);

        System.out.println("List: " + list);
        System.out.println("Sum of squares: " + sum);
    }
}
