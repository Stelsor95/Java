// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

package Java_projects;

import java.util.Scanner;

class Task01 {
    static int getTriangleNumber(int n) {
        int sum = 0;
        for (int index = 0; index < n; index++) {
            sum += index + 1;
        }
        return sum;
    }

    static int getFactorial(int n) {
        int result = 1;
        for (int index = 0; index < n; index++) {
            result *= index + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 0;
        System.out.printf("Введите натуральное число: ");
        if (!scn.hasNextInt()) {
            System.out.println("Вы ввели неправильный номер");
        } else {
            n = scn.nextInt();
            if (n < 1)
                System.out.println("Вы должны ввести только положительное число");
            else {
                System.out.printf("Сумма чисел от 1 до n %d: %s", n, getTriangleNumber(n));
                System.out.println();
                System.out.printf("Произведение чисел от 1 до %d: %s", n, getFactorial(n));
            }
        }
        scn.close();
    }
}