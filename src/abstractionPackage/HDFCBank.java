package abstractionPackage;

public class HDFCBank extends BankAbstractClass {

    @Override
    void bankDenominations() {
        System.out.println("Available denominations are: 50,100,200,500,2000");
    }
}
