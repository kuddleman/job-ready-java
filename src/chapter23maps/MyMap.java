package chapter23maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {
    public static void main(String[] args) {
        Map<String, Integer> populations = new HashMap<>();

        populations.put("USA", 328_000_000);
        populations.put("Canada", 375_900_000);
        populations.put("Japan", 126_000_000);
        populations.put("United Kingdom", 66_800_000);

        System.out.println("The size of my map is " + populations.size());

        Integer japanPop = populations.get("Japan");
        System.out.println("The population of Japan is: " + japanPop);

        populations.put("USA", 328_000_002);

        Integer usaPop = populations.get("USA");
        System.out.println("The population of the USA is: " + usaPop);

        populations.remove("Japan");
        System.out.println(populations);

        Set<String> keys = populations.keySet();
        System.out.println(keys);

        for (String key : keys) {
            System.out.println(key);
        }

        Set<Map.Entry<String, Integer>> entries = populations.entrySet();

        for (Map.Entry e : entries) {
            System.out.println("The population of " + e.getKey() + " is " + e.getValue() + ".");
        }

        // get the values of the map
        Collection<Integer> popValues = populations.values();
        System.out.println(popValues);

    }

}
