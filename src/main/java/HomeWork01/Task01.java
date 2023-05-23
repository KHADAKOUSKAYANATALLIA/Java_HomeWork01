package HomeWork01;
// Вычислить n-ое треугольного число (сумма чисел от 1 до n),
// n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = sc.nextInt();
        int factorial = 1;
        int triangNumb = n * (n + 1) / 2;

        System.out.println("n-ное треугольное число = " + triangNumb);

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.print("Факториал числа n! = " + factorial);
        sc.close();

    }
}