package Lesson4.ClassWork4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task_2 {
    // Нужно сохранить text в связный список.
    // Если введено print~num, выводит строку из позиции num в связном списке и
    // удаляет её из списка.
    public static void main(String[] args) {
        Scanner iscan = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<>();
        while (true) {
            String n = iscan.nextLine();
            if (n.equals("stop")) {
                break;
            } else {
                if (n.contains("print~")) {
                    ArrayList<String> str = new ArrayList(Arrays.asList(n.split("~")));
                    int a = Integer.parseInt(str.get(1));
                    if (a < ll.size() && a > -1) {
                        System.out.println(ll.get(a));
                        ll.remove(a);
                    }
                    else{
                        System.out.println("некорректный индекс");
                    }

                } else {
                    ll.add(n);
                }
                System.out.println(ll);
            }

        }
    }
}
