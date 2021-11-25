package abstractionPackage;

public class AxisBank extends BankAbstractClass {

    @Override
    void bankDenominations() {
        System.out.println("Available denominations are: 200,500,2000");
    }
}
