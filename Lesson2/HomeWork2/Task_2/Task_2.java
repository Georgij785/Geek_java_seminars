package Lesson2.HomeWork2.Task_2;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;

public class Task_2 {
    public static void main(String[] args) {
        try{FileReader fr= new FileReader("Lesson2/HomeWork2/Task_2/Text.txt");
            int c;
            StringBuilder a=new StringBuilder();
            while ((c=fr.read())!=-1) {
                a.append((char)c);
            }
            String b=a.toString();
            String[] schoolBase=b.split("\s");
            
            for (int i = 0; i < schoolBase.length; i++) {
                schoolBase[i].split("\",\"");
                
            }
            System.out.println(schoolBase);
            for (int i = 0; i< 2; i++) {
                System.out.println();
            }
            
        }
        catch (Exception e) {
            System.out.println("asd");
        }
    }


}
