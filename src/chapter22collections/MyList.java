package chapter22collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        System.out.println("List size: " + strings.size());

        strings.add("A");
        strings.add("B");
        strings.add("C");

        System.out.println("List size: " + strings.size());

        strings.add(1, "A new string");

        strings.remove("A");
        strings.remove(2);

        for(int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
        System.out.println("****************");
        for (String str : strings) {
            System.out.println(str);
        }
        System.out.println("****************");

        Iterator<String> iterator = strings.iterator();
        while(iterator.hasNext()) {
            String currentString = iterator.next();
            System.out.println(currentString);
        }
    }
}
