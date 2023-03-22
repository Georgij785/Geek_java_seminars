package Lesson6.Homework;

import java.util.HashMap;

public class Laptops {
    String colour;
    String OS;
    String hd;
    HashMap conf;
    int id;
    Laptops(int id,String OS_name,String colour,String hd){
        this.conf=new HashMap<>();
        this.colour=colour;
        this.conf.putIfAbsent(1,colour);
        this.OS=OS_name;
        this.conf.putIfAbsent(2,OS_name);
        this.hd=hd;
        this.conf.putIfAbsent(3,hd);
        this.id=id;



    }

}
