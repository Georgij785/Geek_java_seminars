package Lesson4.ClassWork4;

import java.util.Scanner;
import java.util.Stack;
// Реализовать консольное приложение, которое:

// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// 3. Остановка на stop
public class Task_3 {
    public static void main(String[] args) {
        Scanner iscan = new Scanner(System.in);
        Stack<String> stack=new Stack<>();
        while(true){
            String n =iscan.nextLine();
            if (n.equals("stop")) {
                System.out.println("конец программы");
                break;
            }
            else{
                if (n.equals("print")) {
                    while (!stack.isEmpty()) {
                        System.out.println(stack.pop()); 
                    }
                    System.out.println("\n");
                }
                else{
                    stack.push(n);
                }
            }
        }
    }
}
