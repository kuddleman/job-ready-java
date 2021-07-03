package chapter23maps.reusableUser;

import java.util.Scanner;

public class UserIOImpl implements UserIO{

    Scanner scan = new Scanner(System.in);

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        return scan.nextLine();
    }

    @Override
    public int readInt(String prompt) {
        System.out.println(prompt);
        return Integer.parseInt(scan.nextLine());
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        System.out.println("Please enter a number between " + min + " and " + max );
            int num = Integer.parseInt(scan.nextLine());
            while( num <= min || num >= max) {
                System.out.println("Sorry, you number has to be between " + min + " and " + max);
                System.out.println("Enter another number");
                num = Integer.parseInt(scan.nextLine());
            }

        System.out.println("Nice number!");

        return num;
    }

    @Override
    public double readDouble(String prompt) {
        System.out.println("Please enter a double value: ");
        return Double.parseDouble(scan.nextLine());
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        System.out.println("Please enter a number between " + min + " and " + max );
        double doubleNum = Integer.parseInt(scan.nextLine());
        while( doubleNum <= min || doubleNum >= max) {
            System.out.println("Sorry, you double has to be between " + min + " and " + max);
            System.out.println("Enter another double");
            doubleNum = Integer.parseInt(scan.nextLine());
        }

        System.out.println("Nice number!");

        return doubleNum;
    }

    @Override
    public float readFloat(String prompt) {
        System.out.println("Please enter a double value: ");
        return Float.parseFloat(scan.nextLine());
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        System.out.println("Please enter a float number between " + min + " and " + max );
        float floatNum = Float.parseFloat(scan.nextLine());
        while( floatNum <= min || floatNum >= max) {
            System.out.println("Sorry, your float number has to be between " + min + " and " + max);
            System.out.println("Enter another float number");
            floatNum = Float.parseFloat(scan.nextLine());
        }

        System.out.println("Nice number");

        return floatNum;
    }

    @Override
    public long readLong(String prompt) {
        System.out.println("Please enter a long value: ");
        return Long.parseLong(scan.nextLine());
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        System.out.println("Please enter a long number between " + min + " and " + max );
        long longNum = Long.parseLong(scan.nextLine());
        while( longNum <= min || longNum >= max) {
            System.out.println("Sorry, your long number has to be between " + min + " and " + max);
            System.out.println("Enter another long number");
           longNum = Long.parseLong(scan.nextLine());
        }

        System.out.println("Nice number");

        return longNum;
    }
}
