package Lesson4.Homework;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Stack;

public class Task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> my_list = new LinkedList<>(Arrays.asList(3, 2, 1));
        System.out.println(my_Reverse(my_list));
    }

    public static LinkedList<Integer> my_Reverse(LinkedList<Integer> list) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < list.size(); i++) {
            stack.push(list.get(i));
        }
        list.clear();
        while (!stack.isEmpty()) {
            list.add(stack.pop());

        }
        return list;

    }
}