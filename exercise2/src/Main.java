import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the time difference between your home and destination in hours: ");

        int timeDifference = sc.nextInt();

        int destinationMidnight = (24 + timeDifference) % 24;
        int destinationNoon = (12 + timeDifference) % 24;

        System.out.println("When it is midnight at home, it will be " + destinationMidnight + ":00 at your destination.");
        System.out.println("When it is noon at home, it will be " + destinationNoon + ":00 at your destination.");
    }
}