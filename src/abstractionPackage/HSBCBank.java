package abstractionPackage;

public class HSBCBank extends BankAbstractClass {

    @Override
    void bankDenominations() {
        System.out.println("Available denominations are: 100,200,500,2000");
    }

}
