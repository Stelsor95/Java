
/**
 * Task02
 * Вывести все простые числа от 1 до 1000
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int input = scn.nextInt();
        scn.close();
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= input; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                primes.add(i);
            }
        }
        System.out.println("Простые числа: " + primes);
    }
}