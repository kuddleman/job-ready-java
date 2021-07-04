package chapter24usingSimpleFileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class SimpleFileIO {

    public static void main(String[] args) throws Exception {
        try(PrintWriter out = new PrintWriter(new FileWriter("outFile.txt"))){
            out.println("this is a line in my file...");
            out.println("a second line in my file");
            out.println("a third line in my file...");
            out.flush();  // force everything to be written to the file now!
            out.close();
        }

        Scanner sc = new Scanner(
                new BufferedReader(new FileReader("outFile.txt")));

        while(sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            System.out.println(currentLine);
        }
    }
}
