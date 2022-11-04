import java.util.Scanner;

public class Welcome {

    public static void main(String[] args) {
        System.out.println("Welcome to GITHUB....");
        address();
    }

    public static void address(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full address: ");
        String address = scanner.nextLine();
        System.out.println(address);
    }
}
