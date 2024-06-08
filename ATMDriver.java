import java.util.Scanner;

public class ATMDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ATM a1 = new ATM(50000,2125, 60652497);
        
        System.out.println("Enter your pin: ");
        int pin = sc.nextInt();

        a1.enterPin(pin);
        sc.close();
    }
}
