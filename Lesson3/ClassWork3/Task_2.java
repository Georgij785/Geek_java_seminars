package Lesson3.ClassWork3;

import java.util.ArrayList;
import java.util.Arrays;
// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке.
public class Task_2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(Arrays.asList("Меркурий","Меркурий","Земля","Земля","Плутон","Плутон","Плутон","Юпитер","Юпитер","Нептун"));
        ArrayList<Integer> counts=new ArrayList<>();
        ArrayList<String> planets=new ArrayList<>(Arrays.asList("Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун", "Плутон"));
        for (int i = 0; i < planets.size(); i++) {
            counts.add(0);
        }
        for (int i =0;i<list.size();i++) {
            for (int j = 0; j < planets.size(); j++) {
                if (list.get(i).equals(planets.get(j))) {
                    counts.set(j, counts.get(j)+1);
                }
            }

                
            
        }
        for (int i = 0; i < counts.size(); i++) {
            if (counts.get(i)>0) {
                System.out.println(planets.get(i)+":"+counts.get(i));
            }
        }
///////////////////////////////////////////////////////////////////////////////
        // String prevPlanet = null;
        // int count = 0;
        // list.sort(null);
        // // Выводим названия планет и количество их повторений
        // for (String planet : list) {
        //     if (planet.equals(prevPlanet)) {
        //         count++;
        //     } else {
        //         if (prevPlanet != null) {
        //             System.out.println(prevPlanet + ": " + count);
        //         }
        //         prevPlanet = planet;
        //         count = 1;
        //     }
        // }
//////////////////////////////////////////////////////////////////////////////////////////////////
        // // Выводим информацию о последней планете в списке
        // System.out.println(prevPlanet + ": " + count);
        // public static void main(String[] args) {
        //     ArrayList<String> Planets = new ArrayList<>(Arrays.asList("Венера", "Земля", "Марс", "Юпитер", "Марс","Юпитер"));
        //     Planets.sort(Comparator.naturalOrder());
        //     System.out.println(Planets);
        //     int count = 1;
        //     String planet = Planets.get(0);
        //     for (int i = 1; i < Planets.size(); i++) {
        //         if (Planets.get(i).equals(planet)) {
        //             count++;
        //         } else {
        //             System.out.println(planet + " " + count);
        //             count = 1;
        //             planet = Planets.get(i);
        //         }
        //     }
        //     System.out.println(Planets.get(Planets.size()-1)+" "+count);
        // }
        // ArrayList<String> Planets = new ArrayList<>(Arrays.asList("Венера", "Земля", "Марс", "Юпитер", "Марс"));
        // for (int i = 0; i < Planets.size(); i++) {
        //     System.out.printf("%s %d\n", Planets.get(i), Collections.frequency(Planets, Planets.get(i)));
        // }
    }
}
