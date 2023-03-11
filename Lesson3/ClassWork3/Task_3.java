package Lesson3.ClassWork3;

import java.util.ArrayList;
import java.util.Arrays;

// Создать список типа ArrayList. 
// Поместить в него как строки, так и целые числа.
//  Пройти по списку, найти и удалить целые числа.
public class Task_3 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>(Arrays.asList("qwer", 23, "dfg", 21, 6, "asd", 45));
        for (int i = list.size() - 1; i >= 0; i--) {
            if ((list.get(i)) instanceof Integer) {
                list.remove(i);
            }

        }
        System.out.println(list);
    }                  
}
