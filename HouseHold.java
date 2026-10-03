import java.util.Scanner;

public class HouseHold {

    static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1a) Data Types
        int members = 4;
        double water = 250.5;
        int houseNumber = 25;
        char status = 'A';

        System.out.println("HOUSEHOLD DETAILS");
        System.out.println("Family Members: " + members);
        System.out.println("Water Consumed: " + water + " litres");
        System.out.println("House Number: " + houseNumber);
        System.out.println("Water Usage Status: " + status);

        // 1b) If-Else
        System.out.print("Enter water consumption: ");
        int consumption = sc.nextInt();

        if (consumption <= 500) {
            System.out.println("Water Bill: Rs.100");
        } else {
            System.out.println("Water Bill: Rs.200");
        }

        // 1c) Methods
        System.out.print("Enter morning usage: ");
        int morning = sc.nextInt();

        System.out.print("Enter evening usage: ");
        int evening = sc.nextInt();

        int total = calculateTotal(morning, evening);

        System.out.println("Total Water Consumption: " + total + " litres");

        sc.close();
    }
}