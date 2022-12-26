package Task4;

/*
ДОМАШНЕЕ ЗАДАНИЕ
Создайте класс Телевизор. Он должен хранить информацию о названии модели, год выпуска, цена, диагональ, производитель. Нужно создать набор телевизоров
и выполнить следующие задачи:
■ Показать все телевизоры;
■ Показать телевизоры с заданной диагональю;
■ Показать все телевизоры одного производителя;
■ Показать все телевизоры текущего года;
■ Показать все телевизоры дороже заданной цены;
■ Показать все телевизоры, отсортированные по цене
по возрастанию;
■ Показать все телевизоры, отсортированные по цене
по убыванию.
Практические задания
2
■ Показать все телевизоры, отсортированные по диагонали по возрастанию;
■ Показать все телевизоры, отсортированные по диагонали по убыванию.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<TV> tv = new ArrayList<>(List.of(
                new TV("Sony", 2017, 2000, 108, "China" ),
                new TV("LG", 2022, 1500,89 , "China" ),
                new TV("Samsung", 2019, 1900, 80, "China" ),
                new TV("Dell", 2020, 500, 100, "China" )
        ));
        System.out.println(tv);

        System.out.println("Введите необходимую диагональ:  ");
        //Здесь ваша реализация ДЗ
        Scanner scanner=new Scanner(System.in);
        int diagonal = scanner.nextInt();
        System.out.println("Все телевизоры с диагональю " + diagonal + ":");
        tv.stream()
                .filter(n->n.getDiagonal()==diagonal)
                .forEach(System.out::println);

        System.out.println("Введите производителя:");
        Scanner scanner1=new Scanner(System.in);
        String manufacturer = scanner1.nextLine();
        System.out.println("Все телевизоры производителя " + manufacturer + ":");
        tv.stream()      //Stream<Car>
                .filter(n -> n.getManufacturer().equals(manufacturer))
                .forEach(System.out::println);


        System.out.println("Введите текущий год:  ");
        int year = scanner.nextInt();
        System.out.println("Все телевизоры года " + year + ":");
        tv.stream()
                .filter(n->n.getYear()==year)
                .forEach(System.out::println);

        System.out.println("Введите цену:  ");
        int price = scanner.nextInt();
        System.out.println("Все телевизоры дороже " + price + ":");
        tv.stream()
                .filter(n->n.getPrice()>price)
                .forEach(System.out::println);

List sortedListPrice = tv.stream()
        .sorted((o1, o2) -> o1.getPrice() - o2.getPrice())
        .collect(Collectors.toList());
        System.out.println("Отсортированные телевизоры по цене по возрастанию:");
        System.out.println(sortedListPrice);


        List reverseSortedListPrice = tv.stream()
                .sorted((o1, o2) -> o2.getPrice() - o1.getPrice())
                .collect(Collectors.toList());
        System.out.println("Отсортированные телевизоры по цене по убыванию:");
        System.out.println(reverseSortedListPrice);



        List sortedListDiagonal = tv.stream()
                .sorted((o1, o2) -> o1.getDiagonal() - o2.getDiagonal())
                .collect(Collectors.toList());
        System.out.println("Отсортированные телевизоры по диагонали по возрастанию:");
        System.out.println(sortedListDiagonal);


        List reverseSortedListDiagonal = tv.stream()
                .sorted((o1, o2) -> o2.getDiagonal() - o1.getDiagonal())
                .collect(Collectors.toList());
        System.out.println("Отсортированные телевизоры по диагонали по убыванию:");
        System.out.println(reverseSortedListDiagonal);
    }
}
