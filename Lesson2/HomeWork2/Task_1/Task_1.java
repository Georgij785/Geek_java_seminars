package Lesson2.HomeWork2.Task_1;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>(Arrays.asList(3,4,2,1,2,3,4,1,23));
        System.out.println(BubbleSort_log(list));
    }
    public static ArrayList<Integer> BubbleSort_log(ArrayList<Integer> example){
        try{
            FileWriter file= new FileWriter("Lesson2/HomeWork2/Task_1/Log.txt");
            for (int j = 0; j < example.size()-1; j++) {
                for (int i = 0; i < example.size()-2; i++) {
                    if(example.get(i)>example.get(i+1)){
                        int temp=example.get(i);
                        example.set(i, example.get(i+1));
                        example.set(i+1, temp);
    
                    }
                    file.write("массив:"+example.toString()+"\n");
                }
            }
            file.close();
        }
        catch(Exception e){
            System.out.println("Непредвиденная ошибка");
        }
        
        return example;
    }
}
