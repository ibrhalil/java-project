package _2;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Car {
    private String name;
    private String model;
    @Setter(AccessLevel.PRIVATE)
    private String color = "white";
}

class TestMain{
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("clio");
        car.setModel("renault");
        //car.setColor("red");

        System.out.println(car.getName());
        System.out.println(car.getModel());
        System.out.println(car.getColor());
    }
}
