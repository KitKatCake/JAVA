package Test2;

public class Derived extends Base {
    public Derived() {
        System.out.println("Derived--默认构造方法");
    }

    public Derived(int c) {

        System.out.println("Derived--有参构造方法" + c);
    }

    public Derived(int a, int b) {
       // super();
        System.out.println("Derived--有参构造方法--" + b);
    }
        public static void main (String[]args){
            System.out.println("============子类无参============");
            Derived no = new Derived();
            System.out.println("============子类有参============");
            Derived have = new Derived(33);
            System.out.println("============子类有参============");
            Derived have2 = new Derived(33, 55);
        }
}

