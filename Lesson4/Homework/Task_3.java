package Lesson4.Homework;

import java.util.Scanner;
import java.util.Stack;

public class Task_3 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner iscan = new Scanner(System.in);
        while (true) {
            System.out.println("введите число или действие >");
            String a = iscan.next();
            while (a.equals("отмена")) {
                if (a.toLowerCase().equals("отмена")) {
                    System.out.println(stack);
                    stack.remove(stack.size() - 1);
                    int m = stack.pop();
                    System.out.println(m - 10 + '\n');
                    stack.add(m);
                    System.out.println("введите  действие >");
                    a = iscan.next();
                }
            }

            if (a.charAt(0) == '+' | a.charAt(0) == '-' | a.charAt(0) == '*' | a.charAt(0) == '/') {
                System.out.println("Введите число > ");
                int n = iscan.nextInt();
                if (a.charAt(0) == '+') {
                    int c = stack.get(stack.size() - 1) + n;
                    System.out.println(c + "\n");
                    stack.add(c);
                }
                if (a.charAt(0) == '-') {
                    int c = stack.get(stack.size() - 1) - n;
                    System.out.println(c + "\n");
                    stack.add(c);
                }
                if (a.charAt(0) == '*') {
                    int c = stack.get(stack.size() - 1) * n;
                    System.out.println(c + "\n");
                    stack.add(c);
                }
                if (a.charAt(0) == '/') {
                    int c = stack.get(stack.size() - 1) / n;
                    System.out.println(c + "\n");
                    stack.add(c);

                }
            } else {
                System.out.println("введите действие >");
                char n = iscan.next().charAt(0);
                System.out.println("Введите число > ");
                int b = iscan.nextInt();

                if (n == '+') {
                    int c = Integer.parseInt(a) + b;
                    System.out.println(c + "\n");
                    stack.add(c);

                }
                if (n == '-') {
                    int c = Integer.parseInt(a) - b;
                    System.out.print(c + "\n");
                    stack.add(c);
                }
                if (n == '*') {
                    int c = Integer.parseInt(a) * b;
                    System.out.print(c + "\n");
                    stack.add(c);
                }
                if (n == '/') {
                    int c = Integer.parseInt(a) / b;
                    System.out.print(c + "\n");
                    stack.add(c);
                }
            }
            System.out.println(stack);


        }

    }

}