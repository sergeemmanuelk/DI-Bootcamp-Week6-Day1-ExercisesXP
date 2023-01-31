import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter angle n°1");
        int angle1 = sc.nextInt();

        System.out.println("Enter angle n°2");
        int angle2 = sc.nextInt();

        System.out.println("Enter angle n°3");
        int angle3 = sc.nextInt();

        int sum = angle1 + angle2 + angle3;

        if (sum == 180) {
            System.out.println("It is a valid triangle.");
        } else {
            System.out.println("It is not a valid triangle.");
        }

    }
}