package Java1;

public class Dog extends Animal{
    void eat(){
        System.out.println("dog : eat");
    }
    void eatTest(){
        this.eat();
        super.eat();
    }
    public void move(){
        super.move();
        System.out.println("狗可以跑和走");
    }
}
