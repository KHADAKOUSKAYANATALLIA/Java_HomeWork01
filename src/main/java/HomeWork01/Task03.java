package HomeWork01;

import java.util.Scanner;
/*
Реализовать калькулятор
 */
public class Task03 {
    public static void main(String[] args) {
        System.out.println("Введите математическую операцию: ");
        System.out.println("1 - Сложение");
        System.out.println("2 - Разница");
        System.out.println("3 - Деление");
        System.out.println("4 - Умножение");
        Scanner sc = new Scanner(System.in);
        int enter = sc.nextInt();
        System.out.print("Введите первое число : ");
        int x = sc.nextInt();
        System.out.print("Введите второе число : ");
        int y = sc.nextInt();
        int result = 0;

        switch (enter) {
            case 1 -> {
                result = x + y;
                System.out.printf("Ответ %d", result);
            }
            case 2 -> {
                result = x - y;
                System.out.printf("Ответ %d", result);
            }
            case 3 -> {
                result = x / y;
                System.out.printf("Ответ %d", result);
            }
            case 4 -> {
                result = x * y;
                System.out.printf("Ответ %d", result);
            }
        }
    }
}