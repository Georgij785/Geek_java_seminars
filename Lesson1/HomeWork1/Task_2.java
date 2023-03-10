package Lesson1.HomeWork1;

public class Task_2 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        for (int i = 1; i <= 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
                if (j == i - 1) {
                    System.out.println(i);
                    break;
                }
            }

        }
    }
}
