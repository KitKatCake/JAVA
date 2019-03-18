package Test4;


public class Main {
    final static String salutation = "Hello!";
    final int num = 1;
    public static void main(String[] args) {
        Main main = new Main();
        MathOperation addition = (a,b)->a+b;
        MathOperation subtraction = (a,b)->a-b;
        MathOperation multiplication = (a,b)->a*b;
        MathOperation division = (a,b)->a/b;

        System.out.println("10 + 5 = " + main.operate(10, 5, addition));
        System.out.println("10 + 5 = " + addition.operation(10, 5));
        System.out.println("10 - 5 = " + main.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + main.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + main.operate(10, 5, division));

        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("Runoob");

        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);
        greetService2.sayMessage("Google");

        GreetingService greetingService3 = message -> System.out.println(salutation+message);
        greetingService3.sayMessage("Runoob!");

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world !");
            }
        }).start();

        new Thread(() -> System.out.println("Hello world !")).start();

        Runnable race1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world !");
            }
        };
        race1.run();
        Runnable race2 = () -> System.out.println("Hello world !");
        race2.run();



    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a,b);
    }
}
