package co.com.jcsolid.ocp.solution;

public class CreditCardPayment implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("Processing Credit Card payment of $" + amount);
    }
}
