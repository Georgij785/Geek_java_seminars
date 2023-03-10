package Lesson1.ClassWork1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner iScanner=new Scanner(System.in);
        System.out.println("name: ");
        String a= iScanner.nextLine();
        iScanner.close();

        System.out.printf("Hello, %s",a);
    }
}
