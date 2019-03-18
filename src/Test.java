import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Test {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
       int [] a = {1,3,5,9};
//
//        for (int p:a){
//            System.out.println(p);
//        }




        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);





      //  Test t = new Test();
     //   t.printArray(a);



    }


}
