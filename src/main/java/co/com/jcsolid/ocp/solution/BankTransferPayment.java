package co.com.jcsolid.ocp.solution;

public class BankTransferPayment implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("Processing Bank Transfer payment of $" + amount);
    }
}
