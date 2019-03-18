package Test4;

import Java.Cat;

import java.util.Arrays;
import java.util.List;

public class Car {
    public static Car create(final Supplier<Car> supplier){
        return supplier.get();
    }
    public static void collide(final Car car){
        System.out.println("Collided " + car.toString());
    }
    public void follow(final Car another) {
        System.out.println("Following the " + another.toString());
    }

    public static void main(String[] args) {
        final Car car = Car.create( Car::new );
        final List< Car > cars = Arrays.asList( car );

    }

}
