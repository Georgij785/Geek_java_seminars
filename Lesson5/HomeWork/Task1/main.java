package Lesson5.HomeWork.Task1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner iScan = new Scanner(System.in);
        System.out.println("Введите имя пользователя > ");
        String name = iScan.next();
        System.out.println("Введите первый номер пользователя > ");
        int number = iScan.nextInt();
        numberBook a = new numberBook(name, number);


        while (true) {

            System.out.println("1-Добавить номер \n2-вывести всё");
            int m = iScan.nextInt();
            if (m == 0) {
                break;
            }
            if (m == 1) {
                System.out.println("Введите номер > ");
                int n = iScan.nextInt();
                a.Add(n);
            } else if (m==2){
                a.Printall();
            }
        }

    }

}
