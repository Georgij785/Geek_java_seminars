package Lesson3.Homework3;
//123
import java.util.ArrayList;
import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 2, 1, 4, 5, 4, 3, 43, 43, 43, 43, 434, 3, 4, 23, 2, 2, 45, 46, 76, 86, 43, 45));
        System.out.println(SOrt_Sli(list));
    }

    public static ArrayList<Integer> SOrt_Sli(ArrayList<Integer> list) {
        if (list.size() == 0) {
            return list;
        }
        ArrayList<Integer> b = list;
        int a = list.get(0);
        b.remove(0);
        ArrayList<Integer> min_list = new ArrayList<>();
        ArrayList<Integer> max_list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (b.get(i) <= a) {
                min_list.add(b.get(i));
            } else {
                max_list.add(b.get(i));
            }

        }
        ArrayList<Integer> res = new ArrayList<>();
        res.addAll(SOrt_Sli(min_list));
        res.add(a);
        res.addAll(SOrt_Sli(max_list));
        return res;
    }
}
