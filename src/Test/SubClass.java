package Test;

public class SubClass extends SuperClass {
    private int n;
    SubClass(){
        super(300);
        System.out.println("SubClass");
    }
    public SubClass(int n){
        System.out.println("SubClass(int n):"+n);
        this.n = n;
    }
        public static void main(String[] args) {
            SubClass sc = new SubClass();
            SubClass sc2 = new SubClass(200);
        }
}

