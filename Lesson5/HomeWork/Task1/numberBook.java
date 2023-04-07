package Lesson5.HomeWork.Task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class numberBook {
    String User_name;
    Map<Integer,Integer> numbers=new HashMap();
    int i =2;
    numberBook(String a,int b){
        this.User_name=a;
        this.numbers.put(1,b);

    }
    public void Add(int b){
        this.numbers.put(i++,b);

    }


    public  void Printall() {
        String res="Пльзователь - "+this.User_name+ "\nномера : ";
        for (int i = 1; i <= this.numbers.size(); i++) {
            res+=this.numbers.get(i);
            if (i!=this.numbers.size()){
                res+=" ,";
            }
        }
        System.out.println(res);
    }
}
