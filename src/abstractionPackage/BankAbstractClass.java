package abstractionPackage;

public abstract class BankAbstractClass {
//    public String bankName;

    //Operational Methods
    //Implemented method
    public void bankDetails(String bankName){
        if (bankName.equalsIgnoreCase("Axis Bank")){
            System.out.println("Bank: "+bankName);
            System.out.println("Branch: Koramangala Branch");
            System.out.println("City: Bangalore");
        }else if (bankName.equalsIgnoreCase("HDFC Bank")){
            System.out.println("Bank: "+bankName);
            System.out.println("Branch: MG Road Branch");
            System.out.println("City: Bangalore");
        }else if (bankName.equalsIgnoreCase("HSBC Bank")){
            System.out.println("Bank: "+bankName);
            System.out.println("Branch: HAL branch");
            System.out.println("City: Bangalore");
        }else{
            System.out.println("Wrong input entered");
        }
    }

    //Unimplemented method
    abstract void bankDenominations();
}
