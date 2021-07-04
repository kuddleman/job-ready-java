package chapter24usingSimpleFileIO;

import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteStateCapitals {
    public static void main(String[] args) throws Exception{
        try(PrintWriter out = new PrintWriter(new FileWriter("StateCapitals.txt"))){
            out.println("Alabama::Montgomery");
            out.println("Alaska::Juneau");
            out.println("Arizona::Phoenix");
            out.println("Arkansas::Little Rock");
            out.println("California::Sacramento");
            out.println("Colorado::Denver");
            out.println("Connecticut::Hartford");
            out.println("Delaware::Dover");
            out.println("Florida::Tallahassee");
            out.println("Georgia::Atlanta");
            out.println("Hawaii::Honolulu");
            out.println("Idaho::Boise");
            out.println("Illinois::Springfield");
            out.println("Indiana::Indianapolis");
            out.println("Iowa::Des Moines");
            out.println("Kansas::Topeka");
            out.println("Kentucky::Frankfort");
            out.println("Louisiana::Baton Rouge");
            out.println("Maine::Augusta");
            out.println("Maryland::Annapolis");
            out.println("Massachusetts::Boston");
            out.println("Michigan::Lansing");
            out.println("Minnesota::Saint Paul");
            out.println("Mississippi::Jackson");
            out.println("Missouri::Jefferson City");
            out.println("Montana::Helena");
            out.println("Nebraska::Lincoln");
            out.println("Nevada::Carson City");
            out.println("New Hampshire::Concord");
            out.println("New Jersey::Trenton");
            out.println("New Mexico::Santa Fe");
            out.println("New York::Albany");
            out.println("North Carolina::Raleigh");
            out.println("North Dakota::Bismarck");
            out.println("Ohio::Columbus");
            out.println("Oklahoma::Oklahoma City");
            out.println("Oregon::Salem");
            out.println("Pennsylvania::Harrisburg");
            out.println("Rhode Island::Providence");
            out.println("South Carolina::Columbia");
            out.println("South Dakota:Pierre");
            out.println("Tennessee::Nashville");
            out.println("Texas::Austin");
            out.println("Utah::Salt Lake City");
            out.println("Vermont::Montpelier");
            out.println("Virginia::Richmond");
            out.println("Washington::Olympia");
            out.println("West Virginia::Charleston");
            out.println("Wisconsin::Madison");
            out.println("Wyoming::Cheyenne");
        }
    }
}
