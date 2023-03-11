package Lesson2.HomeWork2.Task_4;

import java.io.FileWriter;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner iscan = new Scanner(System.in);
        System.out.println("Ведите первое число > ");
        int a = iscan.nextInt();
        System.out.println("Ведите  действие(*,/,+,-) > ");
        char n = iscan.next().charAt(0);
        System.out.println("Ведите второе число > ");
        int b = iscan.nextInt();
        iscan.close();
        String bc = "";
        if (n == '+') {
            int c = a + b;
            System.out.print(c);
            bc = a + "+" + b + "=" + c;
        }
        if (n == '-') {
            int c = a - b;
            System.out.print(c);
            bc = a + "-" + b + "=" + c;
        }
        if (n == '/') {
            int c = a / b;
            System.out.print(c);
            bc = a + "/" + b + "=" + c;
        }
        if (n == '*') {
            int c = a * b;
            System.out.print(c);
            bc = a + "*" + b + "=" + c;
        }

        try {
            FileWriter file = new FileWriter("Lesson2/HomeWork2/Task_4/Log_calc.txt", true);
            file.write('\n' + bc);
            file.flush();
        } catch (Exception e) {
            System.out.println("Error");

        }
    }
}
