package Lesson4.ClassWork4;
// 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.

import java.util.ArrayList;
import java.util.LinkedList;

// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
public class Task_1 {
    public static void main(String[] args) {
        
        ArrayList <Integer> in=new ArrayList<>();
        LinkedList <Integer> ll= new LinkedList<>();
        long time_start=System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            in.add(i);
        }
        long time_stop=System.currentTimeMillis();
        System.out.println(time_stop-time_start);
        time_start=System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            ll.add(i);
        }
        time_stop=System.currentTimeMillis();
        System.out.println(time_stop-time_start);
    }
}
