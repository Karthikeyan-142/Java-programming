
import java.util.*;

class atm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ppin = 1234;
        int balance = 1000;
        int count = 0;
        while (count < 2) {
            System.out.print("Enter the pin: ");
            int pin = sc.nextInt();
            if (pin != ppin) {
                System.out.println(" Invalid Password So Retry...!!! ");
                count++;
            } else {
                boolean process = true;
                while (process) {
                    System.out.println("1.Deposit");
                    System.out.println("2.Withdraw");
                    System.out.println("3.Balance");
                    System.out.println("4.Exit");
                    System.out.print("Enter the number: ");
                    int num = sc.nextInt();

                    switch (num) {
                        case 1:
                            System.out.print("Enter the deposite amount: ");
                            int deposite = sc.nextInt();
                            deposite += balance;
                            System.out.println("Deposite amount is : " + deposite);
                            break;

                        case 2:
                            System.out.print("Enter the withdraw amt : ");
                            int withdraw = sc.nextInt();

                            if (withdraw < balance) {
                                balance = balance - withdraw;
                                System.out.println("The Withdraw Amt " + withdraw + " Successful");
                            } else {
                                System.out.println("Isufficient Balance");
                            }
                            break;

                        case 3:

                            System.out.println("The Balance Amt is : " + balance);
                            break;

                        case 4:

                            System.out.println("Exit");
                            System.exit(0);
                            break;

                        default:
                            System.out.println("Invalid Number Try Again");
                    }
                    System.out.println("do you contine the process:");
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    System.out.print("Enter the your choice:");
                    int choice = sc.nextInt();

                    if (choice == 2) {
                        process = false;

                    }
                    }

                }
                 if (count == 2) {
                        System.out.println("Atm card is blocked");
                 }
            }

        }
 }
