import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lambda {
    public static void main(String[] args) {

        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");

        String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));

        System.out.println(G7Countries);


        List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");

        features.forEach(n-> System.out.println(n));

        features.forEach(System.out::println);

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        filtered.forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(3,2,2,3,7,3,5);

     //   List<Integer> squareslist = numbers.stream().map(i->i*i).distinct().collect(Collectors.toList());
        List<Integer> squareslist = numbers.stream().map(i->i*i).collect(Collectors.toList());

        squareslist.forEach(System.out::println);

        List<String> str = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

     //   long count = str.stream().filter(string -> !string.isEmpty()).count();

        long count = str.parallelStream().filter(string -> !string.isEmpty()).count();

        System.out.println(count);

        Random random = new Random();

        random.ints().limit(10).sorted().forEach(System.out::println);

      //  Stream.of("a","b","c","","e","f").takeWhile(s->!s.isEmpty()).forEach(System.out::print);

        System.out.println();

     //   IntStream.iterate(3, x -> x < 10, x -> x+ 3).forEach(System.out::println);



    }
}
