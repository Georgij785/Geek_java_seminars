package Lesson3.Homework3;
//123
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class Task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(3, 4, 56, 64, 3, 2, 3, 5, 6, 8, 5));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0)
                list.remove(i--);
        }
        System.out.println(list);
    }
}
