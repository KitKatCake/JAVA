package Test;

public class Cat extends Animal {
    String color;

    public Cat(String name,String color){
        this.name = name;
        this.color = color;
    }
    void eat(){
        System.out.println(color+"的"+name+"正在吃鱼");
    }
}
