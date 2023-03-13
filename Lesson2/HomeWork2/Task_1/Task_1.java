package Lesson2.HomeWork2.Task_1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task_1 {
    public static void main(String[] args) throws IOException {
        Logger ll = Logger.getLogger(Task_1.class.getName());
        String Logpath="Lesson2/HomeWork2/Task_1/Log.txt";
        FileHandler fh = new FileHandler(Logpath,true);
        ll.addHandler(fh);
        SimpleFormatter sf=new SimpleFormatter();
        
        ArrayList <Integer> list=new ArrayList<>(Arrays.asList(3,4,2,1,2,3,4,1,23));
        System.out.println(BubbleSort_log(list,ll));
    }
    public static ArrayList<Integer> BubbleSort_log(ArrayList<Integer> example,Logger ll){
        try{
            
            for (int j = 0; j < example.size()-1; j++) {
                for (int i = 0; i < example.size()-2; i++) {
                    if(example.get(i)>example.get(i+1)){
                        int temp=example.get(i);
                        example.set(i, example.get(i+1));
                        example.set(i+1, temp);
    
                    }
                    ll.info("массив:"+example.toString()+"\n");
                }
            }
        }
        catch(Exception e){
            System.out.println("Непредвиденная ошибка");
        }
        
        return example;
    }
}
