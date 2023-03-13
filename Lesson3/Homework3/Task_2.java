package Lesson3.Homework3;
//123
import java.util.ArrayList;
import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 6, 2, 5, 7, 43, 5, 3, 4, 5, 5, 6, 6, 5, 55, 5, 5, 5));
        list.sort(null);
        int Sum = 0;
        for (int i = 0; i < list.size(); i++) {
            Sum += list.get(i);
        }
        int Average = Sum / list.size();
        System.out.printf("Максимальное число в массиве > %s\nМинимальное число в массиве > %s\nСреднее арифметическое массива > %s", list.get(list.size() - 1), list.get(0), Average);

    }
}
