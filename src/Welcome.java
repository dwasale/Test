import java.util.Scanner;

public class Welcome {

    public static void main(String[] args) {
        System.out.println("Welcome to GITHUB....");
        address();
    }

    public static void address() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter your full name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your full address: ");
        System.out.print("Street: ");
        String streetNumber = scanner.nextLine();
        System.out.print("Post Code: ");
        String postCode = scanner.nextLine();
        System.out.print("City: ");
        String city = scanner.nextLine();

        System.out.println("\n" + name);
        System.out.println("Address");
        System.out.println(streetNumber);
        System.out.println(postCode);
        System.out.println(city);
    }
}
