package chapter22collections;

import java.util.ArrayList;
import java.util.List;

public class MixedUpAnimals {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("cat");
        animals.add(1,"dog");
        System.out.println(animals);
        animals.add(2, "zebra");
        System.out.println(animals);
        animals.add(2, "giraffe");
        System.out.println(animals);
        animals.add(3, "monkey");
        System.out.println(animals);
        animals.add(2, "donkey");
        System.out.println(animals);
        animals.add(3, "lion");
        System.out.println(animals);
        animals.add(6, "tiger");
        System.out.println(animals);
        animals.add(3, "hippo");
        System.out.println(animals);
        animals.add(0, "bear");
        System.out.println(animals);
    }
}
