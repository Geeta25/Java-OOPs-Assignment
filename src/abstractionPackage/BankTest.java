package abstractionPackage;

import java.util.Scanner;

public class BankTest {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Bank name: ");
        String bankName= sc.nextLine();

        if (bankName.equalsIgnoreCase("Axis Bank")){
            AxisBank axisBank = new AxisBank();
            axisBank.bankDetails(bankName);
            axisBank.bankDenominations();
        }else if (bankName.equalsIgnoreCase("HDFC Bank")){
            HDFCBank hdfcBank = new HDFCBank();
            hdfcBank.bankDetails(bankName);
            hdfcBank.bankDenominations();
        }else if (bankName.equalsIgnoreCase("HSBC Bank")){
            HSBCBank hsbcBank = new HSBCBank();
            hsbcBank.bankDetails(bankName);
            hsbcBank.bankDenominations();
        }else{
            System.out.println("Incorrect Bank Name");
        }
    }

}
