package Lesson4.Homework;

import java.util.Arrays;
import java.util.LinkedList;

public class Task_2 {
    public static void main(String[] args) {
        LinkedList a = new LinkedList<>(Arrays.asList(123, 12, 3, "234", 23.34));
        System.out.println(enqueue(a, 2));
        System.out.println(a);
        System.out.println(dequeue(a));
        System.out.println(a);
        System.out.println(first(a));
        System.out.println(a);
    }

    public static LinkedList enqueue(LinkedList a, Object Value) {
//        помещает элемент в конец очереди
        a.addLast(Value);
        return a;
    }

    public static Object dequeue(LinkedList a) {
//        возвращает первый элемент из очереди и удаляет его
        Object x = a.getFirst();
        a.removeFirst();
        return x;
    }

    public static Object first(LinkedList a) {
//     возвращает первый элемент из очереди, не удаляя.
        return a.getFirst();
    }
}
