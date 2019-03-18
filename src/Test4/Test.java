package Test4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String [] players = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka", "David Ferrer",
                "Roger Federer", "Andy Murray",
                "Tomas Berdych", "Juan Martin Del Potro",
                "Richard Gasquet", "John Isner"};

//        Arrays.sort(players, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return (o1.compareTo(o2));
//            }
//        });
//
//        for (String play:players) {
//            System.out.println(play);
//        }



//        Comparator<String> sortByName = (String s1, String s2) -> (s1.compareTo(s2));
//        Arrays.sort(players, sortByName);


      //   Arrays.sort(players, (String s1, String s2) -> (s1.compareTo(s2)));

         Stream.of(players).sorted().forEach(System.out::println);

         Test t = new Test();
         t.print();
    }
    public void print(){
        System.out.println("hello world!");
    }
}
