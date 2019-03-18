import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
new Thread(new Runnable() {
    @Override
    public void run() {
        System.out.println("This is a Thread!");
    }
}).start();

  new Thread(()-> System.out.println("This is another Thread!")).start();

        Stream.of("a","b","c","","e","f").takeWhile(s->!s.isEmpty()).forEach(System.out::print);
        Stream.of("a","b","c","","e","f").dropWhile(s->!s.isEmpty()).forEach(System.out::print);
        IntStream.iterate(3, x -> x < 10, x -> x+ 3).forEach(System.out::println);

    }

}
