import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введи размер списка : ");
        int n = scanner.nextInt();

        logger.log("Просим пользователя ввести верхнюю границу значений элементов в списке");
        System.out.print("Введи верхнюю границу значений элементов в списке :");
        int m = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(50));
        }

        logger.log("Просим пользователя ввести число для фильтрации списка : ");
        System.out.print("Введи число для фильтрации списка : ");
        int f = scanner.nextInt();

        Filter filter = new Filter(f);
        var resultList = filter.filterOut(list);

        logger.log("The fin");

    }
}
