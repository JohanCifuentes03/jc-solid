package co.com.jcsolid.ocp.solution;

public class PayPalPayment implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
