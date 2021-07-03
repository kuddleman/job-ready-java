package chapter22collections;

import java.util.ArrayList;
import java.util.List;

public class ThreeThrees {
    public static void main(String[] args) {
        List<String> strNums = new ArrayList<>();

        strNums.add("One");
        strNums.add("Two");
        strNums.add("Three");
        strNums.add("Four");
        strNums.add("Five");
        strNums.add("Six");
        strNums.add("Three");
        strNums.add("Seven");
        strNums.add("Three");
        strNums.add("Eight");

        System.out.println(strNums);

//        Iterator<String> iterator = strNums.iterator();
//
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        System.out.println("size is:" + strNums.size());
        System.out.println("******************************");
        System.out.println(strNums.get(6));
        System.out.println(strNums.get(8));
        strNums.remove(6);


        System.out.println("size is:" + strNums.size());

        strNums.remove(7);

        System.out.println("size is:" + strNums.size());

        for(String str : strNums) {
            System.out.println(str);
        }

        System.out.println("size is:" + strNums);
    }
}
