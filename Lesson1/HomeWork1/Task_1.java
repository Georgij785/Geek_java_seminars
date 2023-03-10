package Lesson1.HomeWork1;

import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        Scanner iscan = new Scanner(System.in);
        int n = iscan.nextInt();
        iscan.close();
        int n_sum = 0;
        int n_f = 1;
        for (int i = 1; i <= n; i++) {
            n_sum += i;
            n_f = n_f * i;
        }
        System.out.printf("N-ое треугольное число > %s", n_sum);
        System.out.println("");
        System.out.printf("Факториал n-ого числа > %s", n_f);
    }
}

