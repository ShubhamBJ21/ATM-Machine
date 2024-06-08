import java.util.Scanner;

public class ATM{
    Scanner sc = new Scanner(System.in);

    private double balance;
    private int pin;
    private int accNo;

    {
        System.out.println("----------------------------------------");
        System.out.println("---------Welcome to ATM machine---------");
        System.out.println("----------------------------------------");
    }
    
    public ATM()
    {

    }

    public ATM(double balance, int pin, int accNo)
    {
        this.balance = balance;
        this.pin = pin;
        this.accNo = accNo;
    }

    public double getBalance()
    {
        System.out.println("Enter the account number: ");
        int accN = sc.nextInt();

        System.out.println("Enter the Pin: ");
        int pass = sc.nextInt();

        if(accNo==accN && pin==pass)
        {
            System.out.println("login successfully!!");
            return balance;
        }
        else{
            System.out.println("Invalid credentials!!");
            return 0;
        }
       
    }

    public void withdraw()
    {
        System.out.println("Enter the account number: ");
        int accN = sc.nextInt();

        System.out.println("Enter the Pin: ");
        int pass = sc.nextInt();

        if(accNo==accN && pin==pass)
        {
            System.out.println("Login Successfull");

            System.out.println("Enter amount to withdraw");
            int amt = sc.nextInt();

            if(amt>0 && balance-amt>=2000)
            {
                balance-=amt;
                System.out.println("Amount Debited!!");
            }
        }
    }

    public void deposite()
    {
        System.out.println("Enter the account number: ");
        int accN = sc.nextInt();

        System.out.println("Enter the Pin: ");
        int pass = sc.nextInt();

        if(accNo==accN && pin==pass)
        {
            System.out.println("Login successfully");
            System.out.println("Enter amount to deposit");
            int amt = sc.nextInt();
            
            if(amt>0)
            {
                balance+=amt;
                System.out.println("Amount Credieted!!");
            }
        }
    }

    public void updatePin()
    {
        System.out.println("Enter the account number: ");
        int accN = sc.nextInt();

        System.out.println("Enter the Pin: ");
        int pass = sc.nextInt();

        if(accNo==accN && pin==pass)
        {   
            System.out.println("Enter the new pin: ");
            int update = sc.nextInt();

            pin = update;
            System.out.println("pin update successfully");
        }
    }
 
    public void enterPin(int pin)
    {
        Scanner sc = new Scanner(System.in);

        while (true) 
        {
         if(this.pin==pin)
          {
            System.out.println("select your option: ");
            System.out.println("1. getBalance: ");
            System.out.println("2. deposite");
            System.out.println("3. withdraw");
            System.out.println("4. updatePin");
            System.out.println("5. Exit");

            System.out.println("Enter your input: ");
            int ip = sc.nextInt();

            switch (ip) 
            {
                case 1:
                    System.out.println(getBalance());
                    System.out.println("-------------------");
                    break;
            
                case 2:
                    deposite();
                    System.out.println("--------------------");
                    break;

                case 3:
                    withdraw();
                    System.out.println("----------------------");
                    break;

                case 4:
                    updatePin();
                    System.out.println("-------------------------");
                    break;

                case 5:
                    System.out.println("Successfully Exit!!");
                    return;
                default:
                    System.out.println("please select appropriate option");
                    break;
            }
         }
         else
         {
            System.out.println("Invalid pin!!");
         }

        }
    }
}
