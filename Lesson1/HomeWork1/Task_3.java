package Lesson1.HomeWork1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner iscan = new Scanner(System.in);
        System.out.println("Ведите первое число > ");
        int a = iscan.nextInt();
        System.out.println("Ведите  действие(*,/,+,-) > ");
        char n = iscan.next().charAt(0);
        System.out.println("Ведите второе число > ");
        int b = iscan.nextInt();
        iscan.close();
        if (n == '+') {
            System.out.print(a + b);
        }
        if (n == '-') {
            System.out.print(a - b);
        }
        if (n == '*') {
            System.out.print(a * b);
        }
        if (n == '/') {
            System.out.print(a / b);
        }

    }
}
