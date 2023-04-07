package Lesson5.HomeWork;

import java.util.*;

public class Task_2 {
    public static void main(String[] args) {
        ArrayList<String> workers = new ArrayList<>(Arrays.asList("Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"));
        ArrayList Workers_name = new ArrayList<>();
        for (int i = 0; i < workers.size(); i++) {
            String a = workers.get(i);
            String[] b = a.split(" ");
            Workers_name.add(b[0]);

        }
        Set Names_set = new HashSet<>(Workers_name);
        ArrayList<String> names = new ArrayList<>(Names_set);
        ArrayList Names_count = new ArrayList();
        ArrayList count = new ArrayList();
        for (int i = 0; i < names.size(); i++) {
            count.add(0);
        }
        int c = 0;
        System.out.println(Workers_name);
        for (int i = 0; i < Workers_name.size(); i++) {
            for (int j = 0; j < names.size(); j++) {
                if (Workers_name.get(i).equals(names.get(j))) {
                    c = j;
                    int l = Integer.parseInt(count.get(c).toString()) + 1;
                    count.set(c, l);

                }
            }


        }


        Names_count.addAll(count);
        for (int j = 0; j < Names_count.size(); j++) {
            for (int i = 0; i < Names_count.size() - 1; i++) {
                int p = Integer.parseInt(Names_count.get(i).toString());
                int y = Integer.parseInt(Names_count.get(i + 1).toString());
                if (p < y) {
                    String b = names.get(i);
                    names.remove(i);
                    names.add(b);
                    Names_count.remove(i);
                    Names_count.add(p);
                }
            }

        }
        for (int i = 0; i < Names_count.size(); i++) {
            System.out.printf("%s : %s\n", names.get(i), Names_count.get(i));
        }
    }
}
