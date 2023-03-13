package Lesson3.ClassWork3.cl3;

import java.util.ArrayList;

public class Task_1 {
    public static void main(String[] args) {
        // Заполнить список десятью случайными числами. 
        // Отсортировать список методом sort() и вывести его на экран.
        ArrayList<Integer>list=new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }
        list.sort(null);
        System.out.println(list);
    }
}
