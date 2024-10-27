import data.Client;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Lưu thông tin client
        Client Client1 = new Client("HE204225999999", "LUU CHI KIEN", "037206055xx", 60_000, "0814659335");
        Client Client2 = new Client("HE223432424243", "VU TRUONG VU", "0372067Kxxxx", 100_000_000_000l, "0832477790");
        Client Client3 = new Client("HE223432424263", "NGUYEN TIEN DAT", "0372067K7K6", 500_000_000_000l, "0832401770");
        Client Client4 = new Client("HE223424545243", "TRAN TRUC QUYNH", "0xxx206557K6", 700_000_000_000l, "0832401660");
        Client Client5 = new Client("H4523434567543", "NGUYEN DUY BACH", "03xxx6337K6", 100_000l, "0832401110");


        System.out.println("Do you want withdraw money from your banking accout?");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to accept or 0 to dismiss");
        int inputNumber = sc.nextInt();
        if (inputNumber == 1) {
            //nhập số tiền cần rút
            System.out.println("Enter amount to withdraw: ");
            long moneyWithdrew = sc.nextLong();
            Client1.changeBalance(moneyWithdrew);
            if (Client1.getBalance() >= 50000) {
                System.out.println("The amount of money is successfully withdrew");
                System.out.println("The balance now is: " + Client1.getBalance());
                System.out.println("Thank you to use our service! See you again!");
            }
            else
                System.out.println("You don't have enough money to withdraw");
        }
        else
            //kết thúc chương trình
            System.out.println("Thank you! See you again!");

        }
    }
