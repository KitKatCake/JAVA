package Test;

import java.util.stream.Stream;

public class Animal {
    String name;
//    public Animal(){}
//    public Animal(String name){
//        this.name = name;
//    }
    void eat(){
        System.out.println(name+"正在吃");
    }
    void run(){
        System.out.println(name+"正在奔跑");
    }
    void sleep()
    {
        System.out.println(name+"正在睡觉");
    }
}
