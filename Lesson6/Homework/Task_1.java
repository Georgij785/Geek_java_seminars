package Lesson6.Homework;

import java.util.*;

public class Task_1 {
    public static void main(String[] args) {
        Laptops Lap1 = new Laptops(1, "Windows", "red", "100");
        Laptops Lap2 = new Laptops(2, "Linux", "red", "1123");
        Laptops Lap3 = new Laptops(3, "MacOS", "white", "100");
        Laptops Lap4 = new Laptops(4, "Windows", "black", "100123");


        Laptops[] laptops = new Laptops[]{Lap1, Lap2, Lap3, Lap4};

        Filtre_laptops(laptops);

    }

    public static void Filtre_laptops(Laptops[] laptops) {
        ArrayList<String> colours = new ArrayList();
        ArrayList<String> Systems = new ArrayList();
        ArrayList<String> HardDisk = new ArrayList();
        HashMap variants = new HashMap<>();


        Set set = new HashSet();
        for (int j = 0; j < laptops.length; j++) {
            colours.add(laptops[j].colour);
        }
        set.addAll(colours);
        colours.clear();
        colours.addAll(set);
        set.clear();

        for (int j = 0; j < laptops.length; j++) {
            Systems.add(laptops[j].OS);
        }
        set.addAll(Systems);
        Systems.clear();
        Systems.addAll(set);
        set.clear();

        for (int j = 0; j < laptops.length; j++) {
            HardDisk.add(laptops[j].hd);
        }
        set.addAll(HardDisk);
        HardDisk.clear();
        HardDisk.addAll(set);
        set.clear();

        variants.putIfAbsent(1, colours);
        variants.putIfAbsent(2, HardDisk);
        variants.putIfAbsent(3, Systems);


        String[] variants_pc = {"colour", "hard disk", "system"};
        Scanner iScan = new Scanner(System.in);
        for (int i = 0; i < variants_pc.length; i++) {
            System.out.printf("%s -  %s \n", i + 1, variants_pc[i]);
        }


        System.out.println("Введите число критерия");
        int k = iScan.nextInt();
        if (k == 1) {
            for (int i = 1; i <= colours.size(); i++) {
                System.out.printf("%s -  %s\n", i, colours.get(i - 1));
                System.out.println(123);
            }
            System.out.println("asd");
            System.out.println("Введите число цвета");
            int m = iScan.nextInt();
            for (int i = 0; i < laptops.length; i++) {
                if (laptops[i].colour.equals(colours.get(m - 1))) {
                    System.out.printf("вам подойдёт ноутбук номер %s  \n", laptops[i].id);
                }

            }
        } else if (k == 2) {
            for (int i = 1; i <= HardDisk.size(); i++) {
                System.out.printf("%s -  %s\n", i, HardDisk.get(i - 1));
                System.out.println(123);
            }
            System.out.println("Введите индекс нужной вам памяти");
            int m = iScan.nextInt();
            for (int i = 0; i < laptops.length; i++) {
                if (laptops[i].hd.equals(HardDisk.get(m - 1))) {
                    System.out.printf("вам подойдёт ноутбук номер %s  \n", laptops[i].id);
                }

            }
        } else if (k == 3) {
            for (int i = 1; i <= Systems.size(); i++) {
                System.out.printf("%s -  %s\n", i, Systems.get(i - 1));
            }
            System.out.println("Введите индекс нужной операционки");
            int m = iScan.nextInt();
            for (int i = 0; i < laptops.length; i++) {
                if (laptops[i].OS.equals(Systems.get(m - 1))) {
                    System.out.printf("вам подойдёт ноутбук номер %s  \n", laptops[i].id);
                }

            }
        }
    }

}


