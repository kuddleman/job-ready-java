package chapter23maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StateCapitals {

    public static void main(String[] args) {
        Map<String, String> caps = new HashMap<>();

        caps.put("Alabama", "Montgomery");
        caps.put("Alaska", "Juneau");
        caps.put("Arkansas", "Little Rock");
        caps.put("California", "Sacramento");
        caps.put("Colorado", "Denver");
        caps.put("Connecticut", "Hartford");
        caps.put("Delaware", "Dover");
        caps.put("Florida", "Tallahassee");
        caps.put("Georgia", "Atlanta");
        caps.put("Hawaii", "Honolulu");
        caps.put("Idaho", "Boise");
        caps.put("Illinois", "Springfield");
        caps.put("Indiana", "Indianapolis");
        caps.put("Iowa", "Des Moines");
        caps.put("Kansas", "Topeka");
        caps. put("Kentucky", "Frankfort");
        caps.put("Louisiana", "Baton Rouge");
        caps.put("Maine", "Augusta");
        caps.put("Maryland", "Annapolis");
        caps.put("Massachusetts", "Boston");
        caps.put("Michigan", "Lansing");
        caps.put("Minnesota", "Saint Paul");
        caps.put("Mississipi", "Jackson");
        caps.put("Missouri", "Jefferson City");
        caps.put("Montana", "Helena");
        caps.put("Nevada", "Carson City");
        caps.put("New Hampshire", "Concord");
        caps.put("New Jersey", "Trenton");
        caps.put("New Mexico", "Santa Fe");
        caps.put("New York", "Albany");
        caps.put("North Carolina", "Raleigh");
        caps.put("North Dakota", "Bismarck");
        caps.put("Ohio", "Columbus");
        caps.put("Oklahoma", "Oklahoma City");
        caps.put("Oregon", "Salem");
        caps.put("Pennsylvania", "Harrisburg");
        caps.put("Rhode Island", "Providence");
        caps.put("South Carolina", "Columbia");
        caps.put("South Dakota", "Pierre");
        caps.put("Tennessee", "Nashville");
        caps.put("Texas", "Austin");
        caps.put("Utah", "Salt Lake City");
        caps.put("Vermont", "Montpelier");
        caps.put("Virginia", "Richmond");
        caps.put("Washington", "Olympia");
        caps.put("West Virginia", "Charleston");
        caps.put("Wisconsin", "Madison");
        caps.put("Wyoming", "Cheyenne");


        //print all state names to the screen:
        Set<String> stateNames = caps.keySet();

        for(String stateName : stateNames) {
            System.out.println(stateName);
        }

        System.out.println("********************************");
        // print all capital names to the screen
        Collection<String> capNames = caps.values();

        for(String capName : capNames) {
            System.out.println(capName);
        }

        Set<Map.Entry<String, String>> entries = caps.entrySet();

        for(Map.Entry e : entries) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }




    }


}
