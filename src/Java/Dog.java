package Java;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("啃骨头");
    }
    public void work(){
        System.out.println("看家");
    }
}
